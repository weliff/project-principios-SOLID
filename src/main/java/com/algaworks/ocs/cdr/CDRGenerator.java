package com.algaworks.ocs.cdr;

import java.io.File;

public interface CDRGenerator {

	void gerar(String numero, double tempo, double valorLigacao);

	File getFile(String numero);

}