class Main {
    public static void main(String[] args) {
        // use Mike as sample name if there is no input
        String name = "Mike";
        if(args.length != 0) {
            name = args[0];
        }
        NameFun nameFun = new NameFun(name);
        nameFun.allPermutations();
    }
}
