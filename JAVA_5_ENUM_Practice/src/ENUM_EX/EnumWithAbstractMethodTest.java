package ENUM_EX;

enum Country {
	BANGLADESH {
		public String getCurrency() {
			return "TAKA";
		}
	},
	US {

		public String getCurrency() {
			return "DOLLAR";
		}
	},
	RUSSIA {

		public String getCurrency() {
			return "RUBLE";
		}
	},
	INDIA {

		public String getCurrency() {
			return "RUPEE";
		}
	};

	public abstract String getCurrency();
}

public class EnumWithAbstractMethodTest {
	public static void main(String args[]) {
		Country[] countrys = Country.values();

		for (Country country : countrys) {
			System.out.println(country.getCurrency() + " Is the currency of " + country.name());
		}

	}
}
