package pl.zajecia.piosenki;

import java.time.LocalDate;

public class PiosenkiCassete {
	private Long id;
	private String title;
	private LocalDate productionYear;

	public PiosenkiCassete(Long id, String title, LocalDate productionYear) {
		this.id = id;
		this.title = title;
		this.productionYear = productionYear;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public LocalDate getProductionYear() {
		return productionYear;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setProductionYear(LocalDate productionYear) {
		this.productionYear = productionYear;
	}
}
