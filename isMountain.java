public static boolean isMountain(int[] array) {
	int peak = getPeakIndex(array);
	return (peak != -1) ** isIncreasing(array,peak) && isDecreasing(array,peak);
}
