package package2;

interface log_3
{
	void log_in3();
	void log_out3();
}
interface log_2 extends log_3
{
	void log_in2();
	void log_out2();
}
interface log_1 extends log_2
{
	void log_in1();
	void log_out1();
}
public class Interface2 implements log_1{

	public static void main(String[] args) {
		Interface2 i2=new Interface2();
		i2.log_in1();
		i2.log_out1();
		i2.log_in2();
		i2.log_out2();
		i2.log_in3();
		i2.log_out3();
	}

	@Override
	public void log_in2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log_out2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log_in3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log_out3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log_in1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log_out1() {
		// TODO Auto-generated method stub
		
	}

	
	

}
