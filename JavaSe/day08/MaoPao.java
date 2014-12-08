
public class MaoPao{
	public static void main(String[] args){
	int[] arr = {12,7,88,95,41,57};
	for(int i =0;i<arr.length-1;i++){
	for(int j=0;j<arr.length-1;j++){
		if(arr[j]>arr[j+1]){
		int t = arr[j];
		arr[j]=arr[j+1];
		arr[j+1] = t;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
	}
}