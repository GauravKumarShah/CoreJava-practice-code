						TreeSet
TreeSet is use to sort object according to some sorting order.
Depuilcate values are not allowed.
data is sort by some sorting order.
TreeSet only work with on two condition object class should implement comparable interface.
hetrogenus data is not allowed.
TreeSet t = new TreeSet();
t.add(1);
t.add(3);
t.add(5);
t.add(2);
t.add(4);
t.add(4);
t.add(1);
t.add(5);
System.out.println(t);
NOTE:-     All the the wrapper class in java implements camparable interface.
                 String class also implements camparable interface.
	If we are trying to put hetrogenous data into treeSet thrn we will get unchecked exception.

	TreeSet t = new TreeSet();
	t.add("JAVA");
	t.add(1);
		java.lang.classCastExcetpion String             cannot be cast to java.lang.Integer


			Need of Comparable
	

 