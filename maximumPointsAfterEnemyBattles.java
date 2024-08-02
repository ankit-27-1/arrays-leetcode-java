class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        Arrays.sort(enemyEnergies);
        long a=currentEnergy;
        if(enemyEnergies[0]>currentEnergy){
            return 0;
        }
        for(int i=1;i<enemyEnergies.length;i++){
            a+=enemyEnergies[i];
        }
        return a/enemyEnergies[0];
    }
}
