package szamologep;

public class elemek

{
	String elem = new String();

	public elemek(String elem) {
		this.elem = elem;
	}

	public String getElem() {
		return elem;
	}

	public void setElem(String elem) {
		this.elem = elem;
	}




	@Override
	public String toString() {
		return "elemek{" +
				"elem='" + elem + '\'' +
				'}';
	}
}
