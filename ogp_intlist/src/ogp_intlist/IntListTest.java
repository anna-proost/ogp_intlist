package ogp_intlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntListTest {

	@Test
	void test() {
		
		int[] myInts = {0, 3, 5};
		IntList myIntList = new IntList(myInts);
		assertEquals(0, myInts[0]);
		assertEquals(3, myIntList.length());
		assertEquals(5, myIntList.intAt(2));
		
		assertArrayEquals(new int[] {0, 3, 5}, myIntList.toArray());

		myIntList.delete_end();
		assertEquals(2, myIntList.length());
		assertEquals(3, myIntList.intAt(1));
		
		assertArrayEquals(new int[] {0, 3}, myIntList.toArray());
		
		IntList emptyIntList = new IntList();
		assertEquals(0, emptyIntList.length());
		
		assertArrayEquals(new int[] {}, emptyIntList.toArray());
		
		emptyIntList.add_end(4);
		assertEquals(1, emptyIntList.length());
		assertEquals(4, emptyIntList.intAt(0));
		
		assertArrayEquals(new int[] {4}, emptyIntList.toArray());
		
	}

}
