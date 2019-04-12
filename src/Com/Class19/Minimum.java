package Com.Class19;

public class Minimum {

static int maxOfValues(int [] x) {
	
	int max = x[0];
	for(int y:x) {
		if (y > max) {
			max = y;
		}
	}
	return max;
} 
static int minOfValues(int [] x) {
	int min = x[0];
	for (int y : x) {
		if (y < min) {
			min = y;
		}
	}
	return min;
}





}
