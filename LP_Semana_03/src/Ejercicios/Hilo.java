package Ejercicios;


	
	public class Hilo extends Thread{
		private long tiempoDes;
		private String nom;
		
		public Hilo(long tiempoDes,String nom){
			this.tiempoDes=tiempoDes;
			this.nom=nom;
		}
		public void run(){
			while (true) {
				System.out.println(nom);
				try {
					sleep(tiempoDes);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}

