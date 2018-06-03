package aula_10_chain_9_1;

public class Main {

	public static void main(String[] args) {
		double valor = 1.9;
		Slot slot;
		while(valor > 0){
			if(valor >= 1) {
				slot = new Slot_1();
				slot.defineSlot(1);	
				valor = valor - 1;
			} else if(valor >= 0.50) {
				slot = new Slot_10();
				slot.defineSlot(0.5);		
				valor = valor - 0.5;
			} else if(valor >= 0.25) {
				slot = new Slot_25();
				slot.defineSlot(0.25);	
				valor = valor - 0.25;
			} else if(valor >= 0.10) {
				slot = new Slot_10();
				slot.defineSlot(0.1);	
				valor = valor - 0.1;
			} else if(valor >= 0.05) {
				slot = new Slot_05();
				slot.defineSlot(0.05);
				valor = valor - 0.05;
			}
		}
	}
}
