package com.edvaldoLeite.manutencao.enums;

public enum Combustivel {

	GASOLINA(1, "Gasolina"), ALCOOL(2, "Alcool"), DIESEL(3, "Diesel"), GASOLINA_OU_ALCOOL(4, "Flex"),
	ELETRICIDADE(5, "Eletricidade"), ELETRICIDADE_OU_GASOLINA_OU_DIESEL(6, "Hibrido");

	private Integer codigo;
	private String descricao;

	private Combustivel(Integer codigo, String descricao) {
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
	public Combustivel toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}

		for (Combustivel combustivel : Combustivel.values()) {
			if (combustivel.equals(codigo)) {
				return combustivel;
			}
		}
		throw new IllegalArgumentException("Id " + codigo + " inválido");

	}

}
