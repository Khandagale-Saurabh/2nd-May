/**
 * @param {number[]} height
 * @return {number}
 */
//TLE aara improve krne k liye  comparision less krna padega
var maxArea = function(height)
{
   let water=0;
    for(let i=0;i<height.length;i++)
    {
        for(let j=i+1;j<height.length;j++)
        {
            let width=j-i;
            let h=Math.min(height[i],height[j])
            water=Math.max(water,h*width)
            //console.log(water)
        }
    }
    return water
};
