package br.com.alura.screenmatch.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class <T> classe); //IConverteDados vai receber o json que é uma string, vai receber uma classe e no conversor de dados eu vou transformar o json na classe que for indicada
}
