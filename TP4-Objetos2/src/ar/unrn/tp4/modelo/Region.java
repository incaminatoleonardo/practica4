package ar.unrn.tp4.modelo;

public class Region {

	private String region;

	public Region(String region) {

		if (!region.equals("China") && !region.equals("US") && !region.equals("Europa")) {

			throw new RuntimeException("Region desconocida. Las conocidas son: China, US, Europa");
			// JOptionPane.showMessageDialog(this, "Region desconocida. Las conocidas son:
			// China, US, Europa");
			// return;
		}

		this.region = region;
	}

	public String region() {

		return this.region;
	}

}
