package type;

import main.ClonableSymbol;

public class TypeVoid extends TypeAtomic {

	@Override
	public ClonableSymbol clone() {
		return new TypeVoid();
	}

}
