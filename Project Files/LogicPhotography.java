public class LogicPhotography {
	Photography1 pp;
	LogicPhotography(Photography1 p1){
		this.pp=p1;
	}
	public double returnamount() {
		pp.amount=0;
		if(pp.r.isSelected()) {
			if(pp.c1.isSelected()) {
				pp.amount+=10000;
			}
			if(pp.c2.isSelected()) {
				pp.amount+=10000;
			}
		}
		else if(pp.r1.isSelected()){
			if(pp.c3.isSelected()) {
				pp.amount+=20000;
			}
			if(pp.c4.isSelected()) {
				pp.amount+=7000;
			}
			if(pp.c5.isSelected()) {
				pp.amount+=15000;
			}
			if(pp.c6.isSelected()) {
				pp.amount+=25000;
			}
			if(pp.c7.isSelected()) {
				pp.amount+=50000;
			}
			if(pp.c8.isSelected()) {
				pp.amount+=20000;
			}
		}
		if(pp.r3.isSelected()) {
			pp.amount+=100000;
		}
		return pp.amount;
	}
}