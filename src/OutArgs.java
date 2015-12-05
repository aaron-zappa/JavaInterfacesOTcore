
public class OutArgs {
public static void main (String[] args){ 
OutArgs oa = new OutArgs();
oa.setArgs(args);
oa.activate();
if (args.length>0) {
oa.println(args[0]);
}
}

String[] args;

private void println(String string) {
System.out.println("hello:"+string);	
}


private OutArgs setArgs(String[] args) {
	this.args=args;
	return this;
}

private OutArgs activate() {
	return this;	
}
}
