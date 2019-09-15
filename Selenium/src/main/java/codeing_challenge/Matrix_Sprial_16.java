package codeing_challenge;

public class Matrix_Sprial_16 {

	public static void main(String[] args) {
		int i, j;
int a[] [] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
System.out.println("The given matrix is ");
for (i=0; i<4; i++) {
	for (j=0; j<4; j++)
		{System.out.print(a[i][j]+" ");}
	System.out.println();
}
int m=4, n=4, k=0,l=0;
while((k<m) && (l<n)) {
	for(i=l; i<n; i++) {
		System.out.print(a[k][i]+" ");
	} k++;
	for (i=k; i<m; i++) {
		System.out.print(a[i][n-1]+" ");
	} n--;
	if(k<m) {
	for(i=n-1;i>=l;i--) {
		System.out.print(a[m-1][i]+" ");
	} m--;}
	if (l<n) {
	for(i=m-1;i>=k;i--) {
		System.out.print(a[i][l]+" ");
	} l++;
	}
	
}

	}

}
