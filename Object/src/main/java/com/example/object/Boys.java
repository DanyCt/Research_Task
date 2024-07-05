package com.example.object;

public class Boys {
    private String name;
    private String sid;
    private String plays;

    public Boys(String name,String sid, String plays) {
        this.name=name;
        this.plays=plays;
        this.sid=sid;
    }

//tostring

    @Override
    public String toString() {
        return sid + "  " + plays + " " + name;
    }
}
