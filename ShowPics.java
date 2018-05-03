public class ShowPics {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Picture dog = new Picture ("dog.jpg");
	dog.draw();
	dog.translate(600, 600);
	
	Picture bear = new Picture ("bear.jpg");
	bear.draw();
	bear.translate(900, 597);
	
	Picture fox = new Picture ("fox.jpg");
	fox.draw();
	fox.translate(900, 600);
	
	Picture tiger = new Picture ("tiger.jpg");
	tiger.draw();
	tiger.translate(1024, 1024);
	
	
	}

}
