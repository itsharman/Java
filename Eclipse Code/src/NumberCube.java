
public class NumberCube 
{ 
	public int toss() {
		int toss = (int) (Math.random()*6) + 1;
		return toss;
	}
	public int[] getCubeTosses (NumberCube cube, int numTosses)
	{
		int[] cubeTosses = new int[numTosses];
		for (int i = 0; i < numTosses; i++) {
			cubeTosses[i] = cube.toss();
		}
		return cubeTosses;
	}
	public int getLongestRun(int[] values) {
		int currentLen = 0;
		int maxLen = 0;
		int maxStart = -1;
		for (int i = 0; i < values.length-1; i++) {
			if (values[i] == values[i+1]) {
				currentLen++;
				if (currentLen > maxLen) {
					maxLen = currentLen;
					maxStart = i - currentLen + 1;
				}
			}
			else currentLen = 0;
		}
		return maxStart;
	}
	
	//I can't figure how to delete the last comma.
	//I can't seem to fix the "Cube tosses: " output
}