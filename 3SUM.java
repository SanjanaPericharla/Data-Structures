// PROBLEM ON 3 SUM 
// PROBLEM IS ABOUT TRIPLETS SUM MUST BE EQUAL TO 0
// BRUTE FORCE APPROACH
for(int i=0 to n-1)
  for(j = i+1 to n-1)
    for(k = j+1 to n-1)
    if(a[i]+a[j]+a[k] == 0)	// a[i] a[j] a[k] must be unique value so use a set and insert them into it.
    
 TIME COMPLEXITY - O(N^3LOGM) N^3 FOR ITERATING THREE LOOPS AND LOGM FOR INSERTING THE ELEMENTS INTO SET.
 SPACE COMPLEXITY - O(M).
 
 // 2ND APPROACH TAKING HASH AND SET 
 for(int i=0 to n-1)
    hash(a[i])-- 	// for unique values.
    for(int j=i+1 to n-1)
      hash(a[j]) -- 	// for unique values of j
      if(c = -(a[i] - a[j]))
      			// push them to set and arrange in ascending order
      
 TIME COMPLEXITY - O(N^2LOGM)
 SPACE COMPLEXITY - O(M) + O(N)
 
	      
 // 3RD APPROACH - TWO POINTER TECHNIQUE
	      
 public List<List<Integer>> threeSum(int[] num){ 		// CREATING A  FUNCTIOM
	    Arrays.sort(num); 					// SORTING THE ARRAY
	    List<List<Integer>> res = new LinkedList<>(); 	//. CREATING A LIST
	    for(int i=0;i<num.length-2;i++){ 			// TRAVERSING THE LOOP UPTO N-2 BECAUSE 'A' IS FIRST AND WE SHOULD HAVE TWO MORE INDEXES FOR 'B' AND 'C'
	        if(i == 0 || (num[i] != num[i+1])){ 		// FOR DUPLICATES
	            int low = i+1,high = num.length-1,sum = 0-num[i]; 
	            while(low<high){ 				// UNTIL LOW < HIGH
	                if(num[low] + num[high] == sum){ 	// IF LOW + HIGH. = SUM
	                    res.add(Arrays.asList(num[i],num[low],num[high])); //ADD INTO SET
	                    while(low < high && num[low] == num[low+1]) // IF LOW EQUAL TO LOW + 1 INCREMENT LOW
	                    low++;
	                    while(low < high && num[high] == num[high-1]) // IF HIGH EQUAL TO HIGH-1 DECRMENT HIGH
	                    high--;
	                    low++; 
	                    high--;
	                }
	                else if(num[low] + num[high] < sum){ // LOW + HIGH IS LESS THAN SUM
	                    low++; 			     // INCREMENT LOW
	                }
	                else{
	                    high --;			    // OTHERWISE DECRMENT HIGH
	                }
	            }
	        }
          return res; 	// return res.
	    }
	}
  TIME COMPLEXITY - O(N^2)
  SPACE COMPLEXITY - O(1) // AS WE STORING ANSWERS IN LIST
    
