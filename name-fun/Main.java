
class Main {
    public static void main(String[] args) {
    	String name = "Mike";
    	if(args.length != 0) {
    		name = args[0];
    	}
    	NameFun nameFun = new NameFun(name);
    	nameFun.allPermutations();
    }
}
