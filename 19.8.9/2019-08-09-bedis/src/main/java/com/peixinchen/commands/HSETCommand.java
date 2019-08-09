package com.peixinchen.commands;

import com.peixinchen.Command;
import com.peixinchen.Database;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public class HSETCommand implements Command {
    private List<Object>args;
    @Override
    public void setArgs(List<Object> args) {
        this.args = args;
    }

    @Override
    public void run(OutputStream os) throws IOException {
        String key = new String((byte[]) args.get(0));
        String field = new String((byte[]) args.get(1));
        String  value = new String ((byte[]) args.get(2));
       /* Map<String,String> hash = Database.getHashes(kry);
        boolean isUpdate = hash.containsKey()*/
    }
}
