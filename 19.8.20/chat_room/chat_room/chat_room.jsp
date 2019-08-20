<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>聊天大厅</title>
    <style type="text/css">
        .talk_con {
            width: 600px;
            height: 500px;
            border: 1px solid #666;
            margin: 50px auto 0;
            background: #f9f9f9;
        }

        .talk_show {
            width: 580px;
            height: 420px;
            border: 1px solid #666;
            background: #fff;
            margin: 10px auto 0;
            overflow: auto;
        }

        .talk_input {
            width: 580px;
            margin: 10px auto 0;
        }

        .whotalk {
            width: 80px;
            height: 30px;
            float: left;
            outline: none;
        }

        .talk_word {
            width: 420px;
            height: 26px;
            padding: 0px;
            float: left;
            margin-left: 10px;
            outline: none;
            text-indent: 10px;
        }

        .talk_sub {
            width: 56px;
            height: 30px;
            float: left;
            margin-left: 10px;
        }

        .atalk {
            margin: 10px;
        }

        .atalk span {
            display: inline-block;
            background: #0181cc;
            border-radius: 10px;
            color: #fff;
            padding: 5px 10px;
        }

        .btalk {
            margin: 10px;
            text-align: right;
        }

        .btalk span {
            display: inline-block;
            background: #ef8201;
            border-radius: 10px;
            color: #fff;
            padding: 5px 10px;
        }
    </style>
    <script type="text/javascript">
        //
        window.onload = function () {
            var Words = document.getElementById("words");
            var Who = '<%=request.getParameter("username")%>';
            var TalkWords = document.getElementById("talkwords");
            var TalkSub = document.getElementById("talksub");
            var Chat = {};
            Chat.socket = null;

            Chat.connect = (function (host) {
                if ('WebSocket' in window) {
                    Chat.socket = new WebSocket(host);
                } else if ('MozWebSocket' in window) {
                    Chat.socket = new MozWebSocket(host);
                } else {
                    Console.log('Error: WebSocket is not supported by this browser.');
                    return;
                }

                Chat.socket.onopen = function () {
                    Console.log('Info: WebSocket connection opened.');
                    document.getElementById('chat').onkeydown = function (event) {
                        if (event.keyCode === 13) {//13代表回车
                            TalkSub.onclick;//这个地方是关键,如将回车和发送联系起来
                        }
                    };
                };

                Chat.socket.onclose = function () {
                    document.getElementById('chat').onkeydown = null;
                    Console.log('Info: WebSocket closed.');
                };

                Chat.socket.onmessage = function (message) {
                    Console.log(message.data);
                };
            });

            Chat.initialize = function () {
                if (window.location.protocol == 'http:') {
                    Chat.connect('ws://' + window.location.host + '/chat_room/websocket/chat');
                } else {
                    Chat.connect('wss://' + window.location.host + '/chat_room/websocket/chat');
                }
            };

            Chat.sendMessage = (function ( message) {
                if (message !== '') {
                    Chat.socket.send(message);
                }
            });

            var Console = {};

            Console.log = (function (message) {
                //应该和那边的数据保持一致
                var console = document.getElementById('words');
                console.innerHTML = console.innerHTML + message;//此处可能有问题
                while (console.childNodes.length > 25) {
                    console.removeChild(console.firstChild);
                }
                console.scrollTop = console.scrollHeight;
            });

            Chat.initialize();

            TalkSub.onclick = function () {
                //定义空字符串
                var str = "";
                if ("" === TalkWords.value) {
                    // 消息为空时弹窗
                    alert("消息不能为空");
                    return;
                }
                //此时需要获取用户名,应该能成功获取用户名
                str = '<div class="btalk"><span>' + Who+": " + TalkWords.value + '</span></div>';
                //这个字段后台需要处理一下
                Words.innerHTML = Words.innerHTML + str;
                Chat.sendMessage(str);
                while (Words.childNodes.length > 25) {
                    Words.removeChild(Words.firstChild);
                }
                Words.scrollTop = Words.scrollHeight;
            }

        }


    </script>
</head>
<body>
<div class="talk_con">
    <div class="talk_show" id="words">

    </div>

    <div class="talk_input">
        <div>
            <font id="who"><%=request.getParameter("username")%></font>
        </div>
        <input type="text" class="talk_word" id="talkwords">
        <input type="button" value="发送" class="talk_sub" id="talksub">
    </div>
</div>
</body>
</html>