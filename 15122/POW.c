int POW (int base, int exponent) 
//@requires exponent >= 0;
{
    if (exponent == 0) return 1;
    return POW(base, exponent - 1) * base;
}