package com.edvaldoLeite.manutencao.enums;

public enum Especie {

	MOTONETA(1, "Motoneta"), MOTOCICLETA(2, "Motocicleta"), AUTOMOVEL(3, "Automóvel");

	private Integer codigo;
	private String descricao;

	private Especie(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	// metodo retorna seu tipo via codigo
	public Especie toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}

		for (Especie especie : Especie.values()) {
			if (especie.equals(codigo)) {
				return especie;
			}
		}
		throw new IllegalArgumentException("Id " + codigo + " inválido");

	}

}
