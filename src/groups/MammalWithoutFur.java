package groups;

import characteristics.Diet;
import characteristics.Fur;

public class MammalWithoutFur extends Mammal {
	public MammalWithoutFur() {
		super();
		this.add(Fur.WITHOUT);
		this.add(Diet.HERBIVOROUS);
	}
}
