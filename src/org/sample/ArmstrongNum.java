package org.sample;

public class ArmstrongNum {
		private void checkArm(int num) {
				
			int n=num, rem=0, res=0;
			
			while(num>0) {
				rem=num%10;
				res=res+(rem*rem*rem);
				num=num/10;
			}
			if(n==res) {
				System.out.println("Armstrong number:" +n);
			}
			
			else {
				System.out.println("Not an Armstrong number:" +n);
			}
		}
		
		public static void main(String[] args) {
			ArmstrongNum a =new ArmstrongNum();
			a.checkArm(176);
			a.checkArm(479);
			a.checkArm(153);
		}
			
		
	}


