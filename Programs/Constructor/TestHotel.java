class TestHotel {
	public static void main(String[] args){
		Hotel h = new Hotel();
		
		h.name = "Taj";
		String hname = h.name;
		System.out.println(hname);
		
		h.type = "Veg";
		String htype = h.type;
		System.out.println(htype);
		
		h.workers = 50;
		int hworkers = h.workers;
		System.out.println(hworkers+ " Peopels");
		
		h.price = 1500l;
		long hprice = h.price;
		System.out.println(hprice+ " Rs");
	}
}
		
		