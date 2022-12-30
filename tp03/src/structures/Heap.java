package structures;

public class Heap {
	private final String[] heap;
	

	public Heap(String[] args) {
		heap = args.clone();
		}
	private void  swap(int i, int j) {
		String si = heap[i];
		String sj = heap[j];
		heap[i] = sj;
		heap[j] = si;
	}
	private void pullUp(int k) {
		int i = k-1;
		int p = (i-1)/2;
		while (p>=0 && heap[p].compareTo(heap [i])<0)  {
			swap(i,p);
			i = p;
			p= (i-1)/2;
			
		}
	}
	private void buildHeap() {
		int count = heap.length;
		for (int i = 2; i<=count; i++) {
			pullUp(i);
			
		}
	}
	private void pullDown(int i, int k) {
		int f1 = 2*i +1;
		int f2 = 2*i +2;
		if (f1>=k) {
			return;
		}
		if (f2>=k) {
			if (heap[f1].compareTo(heap[i])>0) {
				swap(f1,i);
				return;
			}
		}
		else {
			if (heap[f1].compareTo(heap[f2])<0) {
				if (heap[i].compareTo(heap[f2])<0) {
					swap(i,f2);
					pullDown(f2,k);
					return;
				}
				}
			else {
				if (heap[i].compareTo(heap[f1])<0) {
					swap(i,f2);
					pullDown(f2,k);
					return;
				}
			}
			
		}
			
	}
	
	private void sortHeap() {
		int count = heap.length;
		
		for (int i = count-1; i>=1 ; i--) {
			swap(0, i);
			pullDown(0,i);
		}
	}
	public String[] sort() {
		buildHeap();
		sortHeap();
		return heap;
		
		
	}
		
	}

