package environment;

/**
 * Generic class for handling pair of value.
 *
 * @author cerutt-m21
 * @param <T>
 *        key
 * @param <U>
 *        value
 */
public class Pair<T, U>
{
    T key;
    U value;

    public Pair(T key, U value)
    {
	setKey(key);
	setValue(value);
    }

    public T getKey()
    {
	return this.key;
    }
    
    public U getValue()
    {
	return this.value;
    }
    
    public void setKey(T key)
    {
	this.key = key;
    }
    
    public void setValue(U value)
    {
	this.value = value;
    }
}
