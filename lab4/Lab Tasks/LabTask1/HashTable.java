    /*You will have to complete the FruitNode Contrustor first
    then within this class you only have to complete two methods
    hashFunction() and insert()
    the rest of the metods are already written
    DO NOT TOUCH any other methods or codes*/
    public class HashTable {

        //ht[] :: is the HashTable array that stores the FruitNode objects
        private FruitNode[] ht;

        //Constructor that initializes the HashTable array
        //DO NOT change this Constructor
        public HashTable(int size){
            this.ht = new FruitNode[size];
        }
        
        //This method basically prints the HashTable
        //DO NOT change this method
        public void show(){
            for(int i=0; i<ht.length; i++){
                System.out.print( i+" " );
                FruitNode n = ht[i];
                while (n!=null){
                    System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                    n = n.next;
                }
                System.out.println();
            }
        }

        
        //you need to COMPLETE this method
        private int hashFunction( String key ){
           int length = key.length();
            int sum = 0;

            // Check if the length of the string is even or odd
            if ( key.length() % 2 == 0) {
                
                for (int i = 0; i < length; i += 2) {
                    sum += (int) key.charAt(i);
                }
            } else {
            
                for (int i = 1; i < length; i += 2) {
                    sum += (int) key.charAt(i);
                }
            }

            return sum % 3;
        }

        //you need to COMPLETE this method
        //The insert() method will create a FruitNode using name(Key) & price(value)
        //then inserts it in the proper hashed index
        //If collision occurs resolve using the steps explained in the question
        public void insert(String key, Integer value){
            int hf = hashFunction(key);
            if(ht[hf]==null){
                FruitNode nn = new FruitNode(key, value);
                ht[hf]=nn;
                return;
            }
            FruitNode temp = ht[hf];
            if(temp.fruit[0].equals(key)){
            temp.fruit[1] =   value;

                return;

            }
            FruitNode curr = ht[hf].next;
            FruitNode pred = ht[hf];

            while(curr!=null){
                if(curr.fruit[0].equals(key)){
            curr.fruit[1] =  value;

                return;

            }
            if((Integer)curr.fruit[1]<value){
                FruitNode nn = new FruitNode(key, value);
                pred.next = nn;
                nn.next = curr;
                return;
            }
            pred=pred.next;
            curr=curr.next;
        }
        FruitNode nn = new FruitNode(key, value);
        pred.next=nn;

        

    }
    }
