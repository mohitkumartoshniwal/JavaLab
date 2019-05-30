package j2ee.p2;
import java.util.Comparator;

public class Compare implements Comparator<Books> {

	@Override
	public int compare(Books o1, Books o2) {
		// TODO Auto-generated method stub
		return o1.price-o2.price;
	}

}
