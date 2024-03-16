package telran.arrays;

public class ArrayChar {
	private char[] array;
	public ArrayChar(char[]array) {
		this.array=array;
	}
	public int compareTo(ArrayChar another) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		while(index<length && this.array[index] == another.array[index]) {
			index ++;
		}
		return index == length ? this.array.length - another.array.length : this.array[index] - another.array[index];
	}
	public int indexOf(char character) {
		int index = 0;
		while (index<array.length && array[index] != character) {
			index ++;
		}
		return index == array.length ? -1 : index;
	}
	public int lastIndexOf (char character) {
		int index = array.length-1;
		while (index > -1 && array[index] != character) {
			index --;
		}
		return index;
	}
	public int count(char character) {
		int index = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] == character) index++;
		}
		return index;
	}
	public int compareToIgnporeCase(ArrayChar another) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		while(index<length && 
				Character.toLowerCase(Character.toUpperCase(this.array[index])) == 
				Character.toLowerCase(Character.toUpperCase(another.array[index]))) {
			index ++;
		}
		return index == length ? this.array.length - another.array.length : this.array[index] - another.array[index];
	}
	public boolean contains (char character) {
		boolean index = false;
		for(int i=0; i<array.length; i++) {
			if(array[i] == character) index=true;
			// V.R. If the character is detected then you can leave the circle
		}
		return index;
	}
	public boolean equals(ArrayChar another) {
		int index = compareTo(another);
		return index == 0 ? true:false;
	}
	public boolean equalsIgnoreCase(ArrayChar another) {
		int index = compareToIgnporeCase(another);
		return index == 0 ? true:false;
	}
}
