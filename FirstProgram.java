class FirstClass {
    public static void  main(String args[]){
        //my first program in java
        System.out.println("Namaste World");
    }
}

    for (i=0;i<=arr.length-1;i++){
        d=m-arr[i];
        for(j=i+1;j<=arr.lenght;j++){
            if (arr[j]==d){
                i++;
                j++;
                break;
            }
        }
    }
    

            for (int i = 0; i < arr.size(); i++) {
            int price = arr.get(i);
            int complement = m - price;

            if (flavorIndices.containsKey(complement)) {
                result.add(flavorIndices.get(complement) + 1);
                result.add(i + 1);
                break;
            }

            flavorIndices.put(price, i);
        }

        return result;


    }
    