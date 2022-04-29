public class Cconsumer {

    public static void main(String[] args) {






    }


    static void supDude(Dude dude){
        System.out.println("Live long and Prosper "+dude.getHandle());
    }

    public class Dude{
        public final String handle;
        public final String address;

        Dude(String handle, String address){
            this.handle=handle;
            this.address=address;
        }

        public String getHandle() {
            return handle;
        }

        public String getAddress() {
            return address;
        }
    }





}
