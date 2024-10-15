package com.example.ggastroalert;

public class Dispositivo {
    private String nome;
    private String ip;
    private String port;

    public Dispositivo(String nome, String ip, String port) {
        this.nome = nome;
        this.ip = ip;
        this.port = port;
    }

    public String getNome() {
        return nome;
    }

    public String getIp() {
        return ip;
    }

    public String getPort() {
        return port;
    }
}
