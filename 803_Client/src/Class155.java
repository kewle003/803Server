
public class Class155 {

   float aFloat1720 = 0.0F;
   boolean aBool1721 = true;
   boolean aBool1722 = false;
   int anInt1723 = 0;
   boolean aBool1724 = false;
   int[] anIntArray1725 = null;
   int anInt1726;
   float aFloat1727;
   float aFloat1728;
   float aFloat1729;
   int[] anIntArray1730 = new int[4096];
   float aFloat1731;
   float aFloat1732 = 1.0F;
   int anInt1733;
   int anInt1734 = -1;
   int anInt1735 = 0;
   Class189 aClass189_1736;
   int anInt1737;
   int anInt1738 = 0;
   float[] aFloatArray1739;
   int anInt1740;
   boolean aBool1741 = true;
   int anInt1742 = 0;
   Class103_Sub2 aClass103_Sub2_1743;
   int anInt1744 = 0;
   float aFloat1745 = 0.0F;
   Class529 aClass529_1746;
   int anInt1747 = 0;
   boolean aBool1748 = false;
   int anInt1749 = -1;
   int[] anIntArray1750 = null;
   int[] anIntArray1751;
   int anInt1752 = 0;
   float aFloat1753 = 0.0F;
   int anInt1754 = -1;
   int[] anIntArray1755 = null;
   boolean aBool1756 = false;
   int anInt1757 = 0;
   float aFloat1758 = 0.0F;


   final void method3343(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25, float var26, float var27, float var28) {
      int var29 = var6 - var5;
      float var30 = 1.0F / (float)var29;
      float var31 = (var8 - var7) * var30;
      float var32 = (var10 - var9) * var30;
      float var33 = (var12 - var11) * var30;
      float var34 = (var14 - var13) * var30;
      float var35 = (var16 - var15) * var30;
      float var36 = (var18 - var17) * var30;
      float var37 = (var20 - var19) * var30;
      float var38 = (var22 - var21) * var30;
      float var39 = (var24 - var23) * var30;
      float var40 = (var26 - var25) * var30;
      float var41 = (var28 - var27) * var30;
      if(aBool1748) {
         if(var6 > anInt1733) {
            var6 = anInt1733;
         }

         if(var5 < 0) {
            var7 -= var31 * (float)var5;
            var9 -= var32 * (float)var5;
            var11 -= var33 * (float)var5;
            var13 -= var34 * (float)var5;
            var15 -= var35 * (float)var5;
            var17 -= var36 * (float)var5;
            var19 -= var37 * (float)var5;
            var21 -= var38 * (float)var5;
            var23 -= var39 * (float)var5;
            var25 -= var40 * (float)var5;
            var27 -= var41 * (float)var5;
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var29 = var6 - var5;

         for(var4 += var5; var29-- > 0; var27 += var41) {
            float var42 = 1.0F / var7;
            float var43 = 1.0F / var9;
            if(!var1 || var42 < aFloatArray1739[var4]) {
               float var44 = var11 * var43;
               float var45 = var13 * var43;
               int var46 = (int)(var44 * (float)anInt1752 * aFloat1745) & anInt1744;
               int var47 = (int)(var45 * (float)anInt1752 * aFloat1745) & anInt1744;
               int var48 = anIntArray1725[var47 * anInt1752 + var46];
               var46 = (int)(var44 * (float)anInt1757 * aFloat1753) & anInt1742;
               var47 = (int)(var45 * (float)anInt1757 * aFloat1753) & anInt1742;
               int var49 = anIntArray1750[var47 * anInt1757 + var46];
               var46 = (int)(var44 * (float)anInt1738 * aFloat1758) & anInt1735;
               var47 = (int)(var45 * (float)anInt1738 * aFloat1758) & anInt1735;
               int var50 = anIntArray1755[var47 * anInt1738 + var46];
               float var51 = 1.0F - (var25 + var27);
               var48 = -16777216 | (int)(var25 * (float)(var48 >> 16 & 255)) << 16 | (int)(var25 * (float)(var48 >> 8 & 255)) << 8 | (int)(var25 * (float)(var48 & 255));
               var49 = -16777216 | (int)(var27 * (float)(var49 >> 16 & 255)) << 16 | (int)(var27 * (float)(var49 >> 8 & 255)) << 8 | (int)(var27 * (float)(var49 & 255));
               var50 = -16777216 | (int)(var51 * (float)(var50 >> 16 & 255)) << 16 | (int)(var51 * (float)(var50 >> 8 & 255)) << 8 | (int)(var51 * (float)(var50 & 255));
               int var52 = var48 + var49 + var50;
               int var53 = -16777216 | (int)(var19 * (float)(var52 >> 16 & 255)) << 8 & 16711680 | (int)(var21 * (float)(var52 >> 8 & 255)) & '\uff00' | (int)(var23 * (float)(var52 & 255)) >> 8;
               if(var15 != 0.0F) {
                  int var54 = (int)(255.0F - var15);
                  int var55 = ((anInt1740 & 16711935) * (int)var15 & -16711936 | (anInt1740 & '\uff00') * (int)var15 & 16711680) >>> 8;
                  var53 = (((var53 & 16711935) * var54 & -16711936 | (var53 & '\uff00') * var54 & 16711680) >>> 8) + var55;
               }

               if(var2) {
                  var3[var4] = ((int)var17 | var3[var4] >> 24) << 24 | var53;
               } else {
                  var3[var4] = var53;
               }

               if(var1) {
                  aFloatArray1739[var4] = var42;
               }
            }

            ++var4;
            var7 += var31;
            var9 += var32;
            var11 += var33;
            var13 += var34;
            var15 += var35;
            var17 += var36;
            var19 += var37;
            var21 += var38;
            var23 += var39;
            var25 += var40;
         }

      }
   }

   int method3344() {
      return anIntArray1730[0] % anInt1737;
   }

   Class155(Class103_Sub2 var1, Class189 var2) {
      aClass103_Sub2_1743 = var1;
      aClass189_1736 = var2;
      anInt1737 = aClass103_Sub2_1743.anInt9260 * -1826993761;
      anIntArray1751 = aClass103_Sub2_1743.anIntArray9245;
      aFloatArray1739 = aClass103_Sub2_1743.aFloatArray9248;
      aClass529_1746 = Class529.aClass529_6942;
   }

   final void method3345(boolean var1) {
      aBool1724 = var1;
   }

   final void method3346(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13) {
      if(aBool1724) {
         aClass103_Sub2_1743.method2517((int)var7, (int)var4, (int)var8, (int)var5, var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var8, (int)var5, (int)var9, (int)var6, var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var9, (int)var6, (int)var7, (int)var4, var13, 223909001);
      } else {
         float var14 = var8 - var7;
         float var15 = var5 - var4;
         float var16 = var9 - var7;
         float var17 = var6 - var4;
         float var18 = var11 - var10;
         float var19 = var12 - var10;
         float var20 = 0.0F;
         if(var5 != var4) {
            var20 = (var8 - var7) / (var5 - var4);
         }

         float var21 = 0.0F;
         if(var6 != var5) {
            var21 = (var9 - var8) / (var6 - var5);
         }

         float var22 = 0.0F;
         if(var6 != var4) {
            var22 = (var7 - var9) / (var4 - var6);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)anInt1726) {
                  if(var5 > (float)anInt1726) {
                     var5 = (float)anInt1726;
                  }

                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  var10 = var10 - var24 * var7 + var24;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var22 * var4;
                        var7 -= var20 * var4;
                        var10 -= var25 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var21 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var22 >= var20) && (var4 != var5 || var22 <= var21)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var7, (int)var9, var10, var24);
                           var9 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var8, (int)var9, var10, var24);
                           var9 += var22;
                           var8 += var21;
                           var10 += var25;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var9, (int)var7, var10, var24);
                           var9 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var9, (int)var8, var10, var24);
                           var9 += var22;
                           var8 += var21;
                           var10 += var25;
                           var4 += (float)anInt1737;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var22 * var4;
                        var7 -= var20 * var4;
                        var10 -= var25 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var21 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var22 >= var20) && (var4 != var6 || var21 <= var20)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var7, (int)var8, var10, var24);
                           var8 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var5 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var7, (int)var9, var10, var24);
                           var9 += var21;
                           var7 += var20;
                           var10 += var25;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var8, (int)var7, var10, var24);
                           var8 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var5 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var9, (int)var7, var10, var24);
                           var9 += var21;
                           var7 += var20;
                           var10 += var25;
                           var4 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)anInt1726) {
                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  if(var4 > (float)anInt1726) {
                     var4 = (float)anInt1726;
                  }

                  var11 = var11 - var24 * var8 + var24;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var20 * var5;
                        var8 -= var21 * var5;
                        var11 -= var25 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var22 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var20 >= var21) && (var5 != var6 || var20 <= var22)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var8, (int)var7, var11, var24);
                           var7 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var4 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var9, (int)var7, var11, var24);
                           var7 += var20;
                           var9 += var22;
                           var11 += var25;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var7, (int)var8, var11, var24);
                           var7 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var4 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var7, (int)var9, var11, var24);
                           var7 += var20;
                           var9 += var22;
                           var11 += var25;
                           var5 += (float)anInt1737;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var20 * var5;
                        var8 -= var21 * var5;
                        var11 -= var25 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var22 * var4;
                        var4 = 0.0F;
                     }

                     if(var20 < var21) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var9, (int)var8, var11, var24);
                           var9 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var7, (int)var8, var11, var24);
                           var7 += var22;
                           var8 += var21;
                           var11 += var25;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var8, (int)var9, var11, var24);
                           var9 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var8, (int)var7, var11, var24);
                           var7 += var22;
                           var8 += var21;
                           var11 += var25;
                           var5 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var6 < (float)anInt1726) {
               if(var4 > (float)anInt1726) {
                  var4 = (float)anInt1726;
               }

               if(var5 > (float)anInt1726) {
                  var5 = (float)anInt1726;
               }

               var12 = var12 - var24 * var9 + var24;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var21 * var6;
                     var9 -= var22 * var6;
                     var12 -= var25 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var20 * var4;
                     var4 = 0.0F;
                  }

                  if(var21 < var22) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var8, (int)var9, var12, var24);
                        var8 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var5 >= 0.0F) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var8, (int)var7, var12, var24);
                        var8 += var21;
                        var7 += var20;
                        var12 += var25;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var9, (int)var8, var12, var24);
                        var8 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var5 >= 0.0F) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var7, (int)var8, var12, var24);
                        var8 += var21;
                        var7 += var20;
                        var12 += var25;
                        var6 += (float)anInt1737;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var21 * var6;
                     var9 -= var22 * var6;
                     var12 -= var25 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var20 * var5;
                     var5 = 0.0F;
                  }

                  if(var21 < var22) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var7, (int)var9, var12, var24);
                        var7 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var4 >= 0.0F) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var8, (int)var9, var12, var24);
                        var8 += var20;
                        var9 += var22;
                        var12 += var25;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var9, (int)var7, var12, var24);
                        var7 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var4 >= 0.0F) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var9, (int)var8, var12, var24);
                        var8 += var20;
                        var9 += var22;
                        var12 += var25;
                        var6 += (float)anInt1737;
                     }

                  }
               }
            }
         }
      }
   }

   final void method3347(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12) {
      if(aBool1748) {
         if(var8 > anInt1733) {
            var8 = anInt1733;
         }

         if(var7 < 0) {
            var7 = 0;
         }
      }

      if(var7 < var8) {
         var4 += var7 - 1;
         var9 += var10 * (float)var7;
         var11 += var12 * (float)var7;
         int var13;
         int var14;
         int var15;
         if(aClass189_1736.aBool2220) {
            if(aBool1721) {
               var6 = var8 - var7 >> 2;
               var10 *= 4.0F;
               if(anInt1723 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var9 += var10;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];

                     do {
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  var13 = anInt1723;
                  var14 = 256 - anInt1723;
                  if(var6 > 0) {
                     do {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var9 += var10;
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                     do {
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               }
            } else {
               var6 = var8 - var7;
               if(anInt1723 == 0) {
                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        if(var1) {
                           aFloatArray1739[var4] = var11;
                        }
                     }

                     var11 += var12;
                     var9 += var10;
                     --var6;
                  } while(var6 > 0);
               } else {
                  var13 = anInt1723;
                  var14 = 256 - anInt1723;

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }

                        if(var1) {
                           aFloatArray1739[var4] = var11;
                        }
                     }

                     var9 += var10;
                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else if(aBool1721) {
            var6 = var8 - var7 >> 2;
            var10 *= 4.0F;
            if(anInt1723 == 0) {
               if(var6 > 0) {
                  do {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var9 += var10;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            } else {
               var13 = anInt1723;
               var14 = 256 - anInt1723;
               if(var6 > 0) {
                  do {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var9 += var10;
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                  var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else {
            var6 = var8 - var7;
            if(anInt1723 == 0) {
               do {
                  ++var4;
                  if(!var1 || var11 < aFloatArray1739[var4]) {
                     var3[var4] = Class474.anIntArray6382[(int)var9 & '\uffff'];
                  }

                  var11 += var12;
                  var9 += var10;
                  --var6;
               } while(var6 > 0);
            } else {
               var13 = anInt1723;
               var14 = 256 - anInt1723;

               do {
                  ++var4;
                  if(!var1 || var11 < aFloatArray1739[var4]) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     var15 = var3[var4];
                     if(var2) {
                        var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     } else {
                        var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     }
                  }

                  var9 += var10;
                  var11 += var12;
                  --var6;
               } while(var6 > 0);
            }
         }

      }
   }

   final void method3348(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29, int var30) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else {
         int var31 = (var29 & '\uffff') << 16 | var30 & '\uffff';
         int var33;
         if(var31 != anInt1734) {
            anIntArray1725 = aClass103_Sub2_1743.method15389(var29, var30);
            if(anIntArray1725 == null) {
               anInt1734 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               anInt1747 = 0;
               int var76 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var29), 280235293) & '\uffff'];
               var33 = -16777216 | (var22 >> 16 & 255) * (var76 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var76 >> 8 & 255) & '\uff00' | (var22 & 255) * (var76 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var33, var25, var26, 1372221625), Class54.method1306(var33, var25, var27, 1372221625), Class54.method1306(var33, var25, var28, 1372221625));
               return;
            }

            anInt1734 = var31;
            anInt1752 = aClass103_Sub2_1743.method15365(var29);
            anInt1744 = anInt1752 - 1;
            aClass529_1746 = aClass103_Sub2_1743.method15366(var29);
            aBool1741 = aClass103_Sub2_1743.method15396(var29);
            anInt1747 = aClass103_Sub2_1743.method15367(var29) & 255;
         }

         anInt1740 = var25;
         float var32;
         if(var4 > var5 || var4 > var6) {
            if(var5 <= var6) {
               var32 = var7;
               var7 = var8;
               var8 = var32;
               var32 = var4;
               var4 = var5;
               var5 = var32;
               var32 = var10;
               var10 = var11;
               var11 = var32;
               var32 = var16;
               var16 = var17;
               var17 = var32;
               var32 = var19;
               var19 = var20;
               var20 = var32;
               var32 = var13;
               var13 = var14;
               var14 = var32;
               var32 = var26;
               var26 = var27;
               var27 = var32;
               var33 = var22;
               var22 = var23;
               var23 = var33;
            } else {
               var32 = var7;
               var7 = var9;
               var9 = var32;
               var32 = var4;
               var4 = var6;
               var6 = var32;
               var32 = var10;
               var10 = var12;
               var12 = var32;
               var32 = var16;
               var16 = var18;
               var18 = var32;
               var32 = var19;
               var19 = var21;
               var21 = var32;
               var32 = var13;
               var13 = var15;
               var15 = var32;
               var32 = var26;
               var26 = var28;
               var28 = var32;
               var33 = var22;
               var22 = var24;
               var24 = var33;
            }
         }

         var16 /= var13;
         var17 /= var14;
         var18 /= var15;
         var19 /= var13;
         var20 /= var14;
         var21 /= var15;
         var10 = 1.0F / var10;
         var11 = 1.0F / var11;
         var12 = 1.0F / var12;
         var13 = 1.0F / var13;
         var14 = 1.0F / var14;
         var15 = 1.0F / var15;
         var32 = (float)(var22 >> 24 & 255);
         float var75 = (float)(var23 >> 24 & 255);
         float var34 = (float)(var24 >> 24 & 255);
         float var35 = (float)(var22 >> 16 & 255);
         float var36 = (float)(var23 >> 16 & 255);
         float var37 = (float)(var24 >> 16 & 255);
         float var38 = (float)(var22 >> 8 & 255);
         float var39 = (float)(var23 >> 8 & 255);
         float var40 = (float)(var24 >> 8 & 255);
         float var41 = (float)(var22 & 255);
         float var42 = (float)(var23 & 255);
         float var43 = (float)(var24 & 255);
         float var44 = 0.0F;
         float var45 = 0.0F;
         float var46 = 0.0F;
         float var47 = 0.0F;
         float var48 = 0.0F;
         float var49 = 0.0F;
         float var50 = 0.0F;
         float var51 = 0.0F;
         float var52 = 0.0F;
         float var53 = 0.0F;
         float var54;
         if(var5 != var4) {
            var54 = var5 - var4;
            var44 = (var8 - var7) / var54;
            var45 = (var11 - var10) / var54;
            var46 = (var14 - var13) / var54;
            var47 = (var17 - var16) / var54;
            var48 = (var20 - var19) / var54;
            var49 = (var27 - var26) / var54;
            var50 = (var75 - var32) / var54;
            var51 = (var36 - var35) / var54;
            var52 = (var39 - var38) / var54;
            var53 = (var42 - var41) / var54;
         }

         var54 = 0.0F;
         float var55 = 0.0F;
         float var56 = 0.0F;
         float var57 = 0.0F;
         float var58 = 0.0F;
         float var59 = 0.0F;
         float var60 = 0.0F;
         float var61 = 0.0F;
         float var62 = 0.0F;
         float var63 = 0.0F;
         float var64;
         if(var6 != var5) {
            var64 = var6 - var5;
            var54 = (var9 - var8) / var64;
            var55 = (var12 - var11) / var64;
            var56 = (var15 - var14) / var64;
            var57 = (var18 - var17) / var64;
            var58 = (var21 - var20) / var64;
            var59 = (var28 - var27) / var64;
            var60 = (var34 - var75) / var64;
            var61 = (var37 - var36) / var64;
            var62 = (var40 - var39) / var64;
            var63 = (var43 - var42) / var64;
         }

         var64 = 0.0F;
         float var65 = 0.0F;
         float var66 = 0.0F;
         float var67 = 0.0F;
         float var68 = 0.0F;
         float var69 = 0.0F;
         float var70 = 0.0F;
         float var71 = 0.0F;
         float var72 = 0.0F;
         float var73 = 0.0F;
         if(var4 != var6) {
            float var74 = var4 - var6;
            var64 = (var7 - var9) / var74;
            var65 = (var10 - var12) / var74;
            var66 = (var13 - var15) / var74;
            var67 = (var16 - var18) / var74;
            var68 = (var19 - var21) / var74;
            var69 = (var26 - var28) / var74;
            var70 = (var32 - var34) / var74;
            var71 = (var35 - var37) / var74;
            var72 = (var38 - var40) / var74;
            var73 = (var41 - var43) / var74;
         }

         if(var4 < (float)anInt1726) {
            if(var5 > (float)anInt1726) {
               var5 = (float)anInt1726;
            }

            if(var6 > (float)anInt1726) {
               var6 = (float)anInt1726;
            }

            if(var5 < var6) {
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var21 = var19;
               var28 = var26;
               var34 = var32;
               var37 = var35;
               var40 = var38;
               var43 = var41;
               if(var4 < 0.0F) {
                  var7 -= var44 * var4;
                  var9 -= var64 * var4;
                  var10 -= var45 * var4;
                  var12 -= var65 * var4;
                  var13 -= var46 * var4;
                  var15 -= var66 * var4;
                  var16 -= var47 * var4;
                  var18 -= var67 * var4;
                  var19 -= var48 * var4;
                  var21 -= var68 * var4;
                  var26 -= var49 * var4;
                  var28 -= var69 * var4;
                  var32 -= var50 * var4;
                  var34 -= var70 * var4;
                  var35 -= var50 * var4;
                  var37 -= var70 * var4;
                  var38 -= var50 * var4;
                  var40 -= var70 * var4;
                  var41 -= var50 * var4;
                  var43 -= var70 * var4;
                  var4 = 0.0F;
               }

               if(var5 < 0.0F) {
                  var8 -= var54 * var5;
                  var11 -= var55 * var5;
                  var14 -= var56 * var5;
                  var17 -= var57 * var5;
                  var20 -= var58 * var5;
                  var27 -= var59 * var5;
                  var75 -= var60 * var5;
                  var36 -= var61 * var5;
                  var39 -= var62 * var5;
                  var42 -= var63 * var5;
                  var5 = 0.0F;
               }

               if((var4 == var5 || var64 >= var44) && (var4 != var5 || var64 <= var54)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var32, var34, var35, var37, var38, var40, var41, var43);
                     var7 += var44;
                     var9 += var64;
                     var10 += var45;
                     var12 += var65;
                     var13 += var46;
                     var15 += var66;
                     var16 += var47;
                     var18 += var67;
                     var19 += var48;
                     var21 += var68;
                     var26 += var49;
                     var28 += var69;
                     var32 += var50;
                     var34 += var70;
                     var35 += var51;
                     var37 += var71;
                     var38 += var52;
                     var40 += var72;
                     var41 += var53;
                     var43 += var73;
                  }

                  while(--var6 >= 0.0F) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var8, (int)var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var75, var34, var36, var37, var39, var40, var42, var43);
                     var8 += var54;
                     var9 += var64;
                     var11 += var55;
                     var12 += var65;
                     var14 += var56;
                     var15 += var66;
                     var17 += var57;
                     var18 += var67;
                     var20 += var58;
                     var21 += var68;
                     var27 += var59;
                     var28 += var69;
                     var75 += var60;
                     var34 += var70;
                     var36 += var61;
                     var37 += var71;
                     var39 += var62;
                     var40 += var72;
                     var42 += var63;
                     var43 += var73;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var34, var32, var37, var35, var40, var38, var43, var41);
                     var7 += var44;
                     var9 += var64;
                     var10 += var45;
                     var12 += var65;
                     var13 += var46;
                     var15 += var66;
                     var16 += var47;
                     var18 += var67;
                     var19 += var48;
                     var21 += var68;
                     var26 += var49;
                     var28 += var69;
                     var32 += var50;
                     var34 += var70;
                     var35 += var51;
                     var37 += var71;
                     var38 += var52;
                     var40 += var72;
                     var41 += var53;
                     var43 += var73;
                  }

                  while(--var6 >= 0.0F) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var9, (int)var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var34, var75, var37, var36, var40, var39, var43, var42);
                     var8 += var54;
                     var9 += var64;
                     var11 += var55;
                     var12 += var65;
                     var14 += var56;
                     var15 += var66;
                     var17 += var57;
                     var18 += var67;
                     var20 += var58;
                     var21 += var68;
                     var27 += var59;
                     var28 += var69;
                     var75 += var60;
                     var34 += var70;
                     var36 += var61;
                     var37 += var71;
                     var39 += var62;
                     var40 += var72;
                     var42 += var63;
                     var43 += var73;
                     var4 += (float)anInt1737;
                  }
               }
            } else {
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var20 = var19;
               var27 = var26;
               var75 = var32;
               var36 = var35;
               var39 = var38;
               var42 = var41;
               if(var4 < 0.0F) {
                  var7 -= var44 * var4;
                  var8 -= var64 * var4;
                  var10 -= var45 * var4;
                  var11 -= var65 * var4;
                  var13 -= var46 * var4;
                  var14 -= var66 * var4;
                  var16 -= var47 * var4;
                  var17 -= var67 * var4;
                  var19 -= var48 * var4;
                  var20 -= var68 * var4;
                  var26 -= var49 * var4;
                  var27 -= var69 * var4;
                  var32 -= var50 * var4;
                  var75 -= var70 * var4;
                  var35 -= var50 * var4;
                  var36 -= var70 * var4;
                  var38 -= var50 * var4;
                  var39 -= var70 * var4;
                  var41 -= var50 * var4;
                  var42 -= var70 * var4;
                  var4 = 0.0F;
               }

               if(var6 < 0.0F) {
                  var9 -= var54 * var6;
                  var12 -= var55 * var6;
                  var15 -= var56 * var6;
                  var18 -= var57 * var6;
                  var21 -= var58 * var6;
                  var28 -= var59 * var6;
                  var34 -= var60 * var6;
                  var37 -= var61 * var6;
                  var40 -= var62 * var6;
                  var43 -= var63 * var6;
                  var6 = 0.0F;
               }

               if((var4 == var6 || var64 >= var44) && (var4 != var6 || var54 <= var44)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var7, (int)var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var32, var75, var35, var36, var38, var39, var41, var42);
                     var8 += var64;
                     var7 += var44;
                     var11 += var65;
                     var10 += var45;
                     var14 += var66;
                     var13 += var46;
                     var17 += var67;
                     var16 += var47;
                     var20 += var68;
                     var19 += var48;
                     var27 += var69;
                     var26 += var49;
                     var75 += var70;
                     var32 += var50;
                     var36 += var71;
                     var35 += var51;
                     var39 += var72;
                     var38 += var52;
                     var42 += var73;
                     var41 += var53;
                  }

                  while(--var5 >= 0.0F) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var32, var34, var35, var37, var38, var40, var41, var43);
                     var7 += var44;
                     var9 += var54;
                     var10 += var45;
                     var12 += var55;
                     var13 += var46;
                     var15 += var56;
                     var16 += var47;
                     var18 += var57;
                     var19 += var48;
                     var21 += var58;
                     var26 += var49;
                     var28 += var59;
                     var32 += var50;
                     var34 += var60;
                     var35 += var51;
                     var37 += var61;
                     var38 += var52;
                     var40 += var62;
                     var41 += var53;
                     var43 += var63;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var8, (int)var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var75, var32, var36, var35, var39, var38, var42, var41);
                     var7 += var44;
                     var8 += var64;
                     var10 += var45;
                     var11 += var65;
                     var13 += var46;
                     var14 += var66;
                     var16 += var47;
                     var17 += var67;
                     var19 += var48;
                     var20 += var68;
                     var26 += var49;
                     var27 += var69;
                     var32 += var50;
                     var75 += var70;
                     var35 += var51;
                     var36 += var71;
                     var38 += var52;
                     var39 += var72;
                     var41 += var53;
                     var42 += var73;
                  }

                  while(--var5 >= 0.0F) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var34, var32, var37, var35, var40, var38, var43, var41);
                     var9 += var54;
                     var7 += var44;
                     var12 += var55;
                     var10 += var45;
                     var15 += var56;
                     var13 += var46;
                     var18 += var57;
                     var16 += var47;
                     var21 += var58;
                     var19 += var48;
                     var28 += var59;
                     var26 += var49;
                     var34 += var60;
                     var32 += var50;
                     var37 += var61;
                     var35 += var51;
                     var40 += var62;
                     var38 += var52;
                     var43 += var63;
                     var41 += var53;
                     var4 += (float)anInt1737;
                  }
               }
            }

         }
      }
   }

   final void method3349(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      if(aBool1748) {
         if(var8 > anInt1733) {
            var8 = anInt1733;
         }

         if(var7 < 0) {
            var7 = 0;
         }
      }

      if(var7 < var8) {
         int var17;
         int var19;
         int var18;
         int var21;
         int var20;
         int var22;
         if(aBool1756) {
            var4 += var7;
            var11 += var12 * (float)var7;
            var13 += var14 * (float)var7;
            var15 += var16 * (float)var7;
            if(aBool1721) {
               var6 = var8 - var7 >> 2;
               var12 *= 4.0F;
               var14 *= 4.0F;
               var16 *= 4.0F;
               if(anInt1723 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        var3[var4++] = var5;
                        --var6;
                     } while(var6 > 0);
                  }
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }

                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                     do {
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }

                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  if(var6 > 0) {
                     do {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var18 = var4++;
                        var20 = var3[var18];
                        var21 = var5 + var20;
                        var22 = (var5 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        var21 = var4++;
                        int var23 = var3[var21];
                        int var24 = var5 + var23;
                        int var25 = (var5 & 16711935) + (var23 & 16711935);
                        var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                        var3[var21] = -16777216 | var24 - var23 | var23 - (var23 >>> 8);
                        var24 = var4++;
                        int var26 = var3[var24];
                        int var27 = var5 + var26;
                        int var28 = (var5 & 16711935) + (var26 & 16711935);
                        var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                        var3[var24] = -16777216 | var27 - var26 | var26 - (var26 >>> 8);
                        var27 = var4++;
                        int var29 = var3[var27];
                        int var30 = var5 + var29;
                        int var31 = (var5 & 16711935) + (var29 & 16711935);
                        var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                        var3[var27] = -16777216 | var30 - var29 | var29 - (var29 >>> 8);
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        var18 = var4++;
                        var20 = var3[var18];
                        var21 = var5 + var20;
                        var22 = (var5 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        --var6;
                     } while(var6 > 0);
                  }
               }
            } else {
               var6 = var8 - var7;
               if(anInt1723 == 0) {
                  do {
                     var3[var4++] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;

                  do {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                     var19 = var3[var4];
                     if(var2) {
                        var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                     } else {
                        var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                     }

                     --var6;
                  } while(var6 > 0);
               } else {
                  do {
                     var18 = var4++;
                     var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var20 = var3[var18];
                     var21 = var19 + var20;
                     var22 = (var19 & 16711935) + (var20 & 16711935);
                     var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                     var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               }
            }

         } else {
            var4 += var7 - 1;
            var9 += var10 * (float)var7;
            var11 += var12 * (float)var7;
            var13 += var14 * (float)var7;
            var15 += var16 * (float)var7;
            if(aClass189_1736.aBool2220) {
               if(aBool1721) {
                  var6 = var8 - var7 >> 2;
                  var12 *= 4.0F;
                  var14 *= 4.0F;
                  var16 *= 4.0F;
                  if(anInt1723 == 0) {
                     if(var6 > 0) {
                        do {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                        do {
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  } else if(!aBool1722) {
                     var17 = anInt1723;
                     var18 = 256 - anInt1723;
                     if(var6 > 0) {
                        do {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                        do {
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  } else {
                     if(var6 > 0) {
                        do {
                           var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                        do {
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  }

               } else {
                  var6 = var8 - var7;
                  if(anInt1723 == 0) {
                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           if(var1) {
                              aFloatArray1739[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  } else if(!aBool1722) {
                     var17 = anInt1723;
                     var18 = 256 - anInt1723;

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  } else {
                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var20 = var3[var4];
                           var21 = var19 + var20;
                           var22 = (var19 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                           if(var1) {
                              aFloatArray1739[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  }

               }
            } else if(aBool1721) {
               var6 = var8 - var7 >> 2;
               var12 *= 4.0F;
               var14 *= 4.0F;
               var16 *= 4.0F;
               if(anInt1723 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  if(var6 > 0) {
                     do {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               }

            } else {
               var6 = var8 - var7;
               if(anInt1723 == 0) {
                  do {
                     ++var4;
                     if(!var1 || var9 < aFloatArray1739[var4]) {
                        var3[var4] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;

                  do {
                     ++var4;
                     if(!var1 || var9 < aFloatArray1739[var4]) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else {
                  do {
                     ++var4;
                     if(!var1 || var9 < aFloatArray1739[var4]) {
                        var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var20 = var3[var4];
                        var21 = var19 + var20;
                        var22 = (var19 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               }

            }
         }
      }
   }

   final void method3350(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25, float var26, float var27, float var28) {
      int var29 = var6 - var5;
      float var30 = 1.0F / (float)var29;
      float var31 = (var8 - var7) * var30;
      float var32 = (var10 - var9) * var30;
      float var33 = (var12 - var11) * var30;
      float var34 = (var14 - var13) * var30;
      float var35 = (var16 - var15) * var30;
      float var36 = (var18 - var17) * var30;
      float var37 = (var20 - var19) * var30;
      float var38 = (var22 - var21) * var30;
      float var39 = (var24 - var23) * var30;
      float var40 = (var26 - var25) * var30;
      float var41 = (var28 - var27) * var30;
      if(aBool1748) {
         if(var6 > anInt1733) {
            var6 = anInt1733;
         }

         if(var5 < 0) {
            var7 -= var31 * (float)var5;
            var9 -= var32 * (float)var5;
            var11 -= var33 * (float)var5;
            var13 -= var34 * (float)var5;
            var15 -= var35 * (float)var5;
            var17 -= var36 * (float)var5;
            var19 -= var37 * (float)var5;
            var21 -= var38 * (float)var5;
            var23 -= var39 * (float)var5;
            var25 -= var40 * (float)var5;
            var27 -= var41 * (float)var5;
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var29 = var6 - var5;

         for(var4 += var5; var29-- > 0; var27 += var41) {
            float var42 = 1.0F / var7;
            float var43 = 1.0F / var9;
            if(!var1 || var42 < aFloatArray1739[var4]) {
               float var44 = var11 * var43;
               float var45 = var13 * var43;
               int var46 = (int)(var44 * (float)anInt1752 * aFloat1745) & anInt1744;
               int var47 = (int)(var45 * (float)anInt1752 * aFloat1745) & anInt1744;
               int var48 = anIntArray1725[var47 * anInt1752 + var46];
               var46 = (int)(var44 * (float)anInt1757 * aFloat1753) & anInt1742;
               var47 = (int)(var45 * (float)anInt1757 * aFloat1753) & anInt1742;
               int var49 = anIntArray1750[var47 * anInt1757 + var46];
               var46 = (int)(var44 * (float)anInt1738 * aFloat1758) & anInt1735;
               var47 = (int)(var45 * (float)anInt1738 * aFloat1758) & anInt1735;
               int var50 = anIntArray1755[var47 * anInt1738 + var46];
               float var51 = 1.0F - (var25 + var27);
               var48 = -16777216 | (int)(var25 * (float)(var48 >> 16 & 255)) << 16 | (int)(var25 * (float)(var48 >> 8 & 255)) << 8 | (int)(var25 * (float)(var48 & 255));
               var49 = -16777216 | (int)(var27 * (float)(var49 >> 16 & 255)) << 16 | (int)(var27 * (float)(var49 >> 8 & 255)) << 8 | (int)(var27 * (float)(var49 & 255));
               var50 = -16777216 | (int)(var51 * (float)(var50 >> 16 & 255)) << 16 | (int)(var51 * (float)(var50 >> 8 & 255)) << 8 | (int)(var51 * (float)(var50 & 255));
               int var52 = var48 + var49 + var50;
               int var53 = -16777216 | (int)(var19 * (float)(var52 >> 16 & 255)) << 8 & 16711680 | (int)(var21 * (float)(var52 >> 8 & 255)) & '\uff00' | (int)(var23 * (float)(var52 & 255)) >> 8;
               if(var15 != 0.0F) {
                  int var54 = (int)(255.0F - var15);
                  int var55 = ((anInt1740 & 16711935) * (int)var15 & -16711936 | (anInt1740 & '\uff00') * (int)var15 & 16711680) >>> 8;
                  var53 = (((var53 & 16711935) * var54 & -16711936 | (var53 & '\uff00') * var54 & 16711680) >>> 8) + var55;
               }

               if(var2) {
                  var3[var4] = ((int)var17 | var3[var4] >> 24) << 24 | var53;
               } else {
                  var3[var4] = var53;
               }

               if(var1) {
                  aFloatArray1739[var4] = var42;
               }
            }

            ++var4;
            var7 += var31;
            var9 += var32;
            var11 += var33;
            var13 += var34;
            var15 += var35;
            var17 += var36;
            var19 += var37;
            var21 += var38;
            var23 += var39;
            var25 += var40;
         }

      }
   }

   final void method3351(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25, float var26, float var27, float var28) {
      int var29 = var6 - var5;
      float var30 = 1.0F / (float)var29;
      float var31 = (var8 - var7) * var30;
      float var32 = (var10 - var9) * var30;
      float var33 = (var12 - var11) * var30;
      float var34 = (var14 - var13) * var30;
      float var35 = (var16 - var15) * var30;
      float var36 = (var18 - var17) * var30;
      float var37 = (var20 - var19) * var30;
      float var38 = (var22 - var21) * var30;
      float var39 = (var24 - var23) * var30;
      float var40 = (var26 - var25) * var30;
      float var41 = (var28 - var27) * var30;
      if(aBool1748) {
         if(var6 > anInt1733) {
            var6 = anInt1733;
         }

         if(var5 < 0) {
            var7 -= var31 * (float)var5;
            var9 -= var32 * (float)var5;
            var11 -= var33 * (float)var5;
            var13 -= var34 * (float)var5;
            var15 -= var35 * (float)var5;
            var17 -= var36 * (float)var5;
            var19 -= var37 * (float)var5;
            var21 -= var38 * (float)var5;
            var23 -= var39 * (float)var5;
            var25 -= var40 * (float)var5;
            var27 -= var41 * (float)var5;
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var29 = var6 - var5;

         for(var4 += var5; var29-- > 0; var27 += var41) {
            float var42 = 1.0F / var7;
            float var43 = 1.0F / var9;
            if(!var1 || var42 < aFloatArray1739[var4]) {
               float var44 = var11 * var43;
               float var45 = var13 * var43;
               int var46 = (int)(var44 * (float)anInt1752 * aFloat1745) & anInt1744;
               int var47 = (int)(var45 * (float)anInt1752 * aFloat1745) & anInt1744;
               int var48 = anIntArray1725[var47 * anInt1752 + var46];
               var46 = (int)(var44 * (float)anInt1757 * aFloat1753) & anInt1742;
               var47 = (int)(var45 * (float)anInt1757 * aFloat1753) & anInt1742;
               int var49 = anIntArray1750[var47 * anInt1757 + var46];
               var46 = (int)(var44 * (float)anInt1738 * aFloat1758) & anInt1735;
               var47 = (int)(var45 * (float)anInt1738 * aFloat1758) & anInt1735;
               int var50 = anIntArray1755[var47 * anInt1738 + var46];
               float var51 = 1.0F - (var25 + var27);
               var48 = -16777216 | (int)(var25 * (float)(var48 >> 16 & 255)) << 16 | (int)(var25 * (float)(var48 >> 8 & 255)) << 8 | (int)(var25 * (float)(var48 & 255));
               var49 = -16777216 | (int)(var27 * (float)(var49 >> 16 & 255)) << 16 | (int)(var27 * (float)(var49 >> 8 & 255)) << 8 | (int)(var27 * (float)(var49 & 255));
               var50 = -16777216 | (int)(var51 * (float)(var50 >> 16 & 255)) << 16 | (int)(var51 * (float)(var50 >> 8 & 255)) << 8 | (int)(var51 * (float)(var50 & 255));
               int var52 = var48 + var49 + var50;
               int var53 = -16777216 | (int)(var19 * (float)(var52 >> 16 & 255)) << 8 & 16711680 | (int)(var21 * (float)(var52 >> 8 & 255)) & '\uff00' | (int)(var23 * (float)(var52 & 255)) >> 8;
               if(var15 != 0.0F) {
                  int var54 = (int)(255.0F - var15);
                  int var55 = ((anInt1740 & 16711935) * (int)var15 & -16711936 | (anInt1740 & '\uff00') * (int)var15 & 16711680) >>> 8;
                  var53 = (((var53 & 16711935) * var54 & -16711936 | (var53 & '\uff00') * var54 & 16711680) >>> 8) + var55;
               }

               if(var2) {
                  var3[var4] = ((int)var17 | var3[var4] >> 24) << 24 | var53;
               } else {
                  var3[var4] = var53;
               }

               if(var1) {
                  aFloatArray1739[var4] = var42;
               }
            }

            ++var4;
            var7 += var31;
            var9 += var32;
            var11 += var33;
            var13 += var34;
            var15 += var35;
            var17 += var36;
            var19 += var37;
            var21 += var38;
            var23 += var39;
            var25 += var40;
         }

      }
   }

   final void method3352(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      if(aBool1748) {
         if(var8 > anInt1733) {
            var8 = anInt1733;
         }

         if(var7 < 0) {
            var7 = 0;
         }
      }

      if(var7 < var8) {
         int var17;
         int var19;
         int var18;
         int var21;
         int var20;
         int var22;
         if(aBool1756) {
            var4 += var7;
            var11 += var12 * (float)var7;
            var13 += var14 * (float)var7;
            var15 += var16 * (float)var7;
            if(aBool1721) {
               var6 = var8 - var7 >> 2;
               var12 *= 4.0F;
               var14 *= 4.0F;
               var16 *= 4.0F;
               if(anInt1723 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        var3[var4++] = var5;
                        --var6;
                     } while(var6 > 0);
                  }
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }

                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                     do {
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }

                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  if(var6 > 0) {
                     do {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var18 = var4++;
                        var20 = var3[var18];
                        var21 = var5 + var20;
                        var22 = (var5 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        var21 = var4++;
                        int var23 = var3[var21];
                        int var24 = var5 + var23;
                        int var25 = (var5 & 16711935) + (var23 & 16711935);
                        var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                        var3[var21] = -16777216 | var24 - var23 | var23 - (var23 >>> 8);
                        var24 = var4++;
                        int var26 = var3[var24];
                        int var27 = var5 + var26;
                        int var28 = (var5 & 16711935) + (var26 & 16711935);
                        var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                        var3[var24] = -16777216 | var27 - var26 | var26 - (var26 >>> 8);
                        var27 = var4++;
                        int var29 = var3[var27];
                        int var30 = var5 + var29;
                        int var31 = (var5 & 16711935) + (var29 & 16711935);
                        var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                        var3[var27] = -16777216 | var30 - var29 | var29 - (var29 >>> 8);
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        var18 = var4++;
                        var20 = var3[var18];
                        var21 = var5 + var20;
                        var22 = (var5 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        --var6;
                     } while(var6 > 0);
                  }
               }
            } else {
               var6 = var8 - var7;
               if(anInt1723 == 0) {
                  do {
                     var3[var4++] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;

                  do {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                     var19 = var3[var4];
                     if(var2) {
                        var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                     } else {
                        var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                     }

                     --var6;
                  } while(var6 > 0);
               } else {
                  do {
                     var18 = var4++;
                     var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var20 = var3[var18];
                     var21 = var19 + var20;
                     var22 = (var19 & 16711935) + (var20 & 16711935);
                     var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                     var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               }
            }

         } else {
            var4 += var7 - 1;
            var9 += var10 * (float)var7;
            var11 += var12 * (float)var7;
            var13 += var14 * (float)var7;
            var15 += var16 * (float)var7;
            if(aClass189_1736.aBool2220) {
               if(aBool1721) {
                  var6 = var8 - var7 >> 2;
                  var12 *= 4.0F;
                  var14 *= 4.0F;
                  var16 *= 4.0F;
                  if(anInt1723 == 0) {
                     if(var6 > 0) {
                        do {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                        do {
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  } else if(!aBool1722) {
                     var17 = anInt1723;
                     var18 = 256 - anInt1723;
                     if(var6 > 0) {
                        do {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                        do {
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  } else {
                     if(var6 > 0) {
                        do {
                           var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                        do {
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  }

               } else {
                  var6 = var8 - var7;
                  if(anInt1723 == 0) {
                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           if(var1) {
                              aFloatArray1739[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  } else if(!aBool1722) {
                     var17 = anInt1723;
                     var18 = 256 - anInt1723;

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  } else {
                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var20 = var3[var4];
                           var21 = var19 + var20;
                           var22 = (var19 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                           if(var1) {
                              aFloatArray1739[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  }

               }
            } else if(aBool1721) {
               var6 = var8 - var7 >> 2;
               var12 *= 4.0F;
               var14 *= 4.0F;
               var16 *= 4.0F;
               if(anInt1723 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  if(var6 > 0) {
                     do {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               }

            } else {
               var6 = var8 - var7;
               if(anInt1723 == 0) {
                  do {
                     ++var4;
                     if(!var1 || var9 < aFloatArray1739[var4]) {
                        var3[var4] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;

                  do {
                     ++var4;
                     if(!var1 || var9 < aFloatArray1739[var4]) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else {
                  do {
                     ++var4;
                     if(!var1 || var9 < aFloatArray1739[var4]) {
                        var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var20 = var3[var4];
                        var21 = var19 + var20;
                        var22 = (var19 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               }

            }
         }
      }
   }

   final void method3353(boolean var1, boolean var2, int[] var3, int[] var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25) {
      int var26 = var7 - var6;
      float var27 = 1.0F / (float)var26;
      float var28 = (var9 - var8) * var27;
      float var29 = (var11 - var10) * var27;
      float var30 = (var13 - var12) * var27;
      float var31 = (var15 - var14) * var27;
      float var32 = (var17 - var16) * var27;
      float var33 = (var19 - var18) * var27;
      float var34 = (var21 - var20) * var27;
      float var35 = (var23 - var22) * var27;
      float var36 = (var25 - var24) * var27;
      if(aBool1748) {
         if(var7 > anInt1733) {
            var7 = anInt1733;
         }

         if(var6 < 0) {
            var8 -= var28 * (float)var6;
            var10 -= var29 * (float)var6;
            var12 -= var30 * (float)var6;
            var14 -= var31 * (float)var6;
            var16 -= var32 * (float)var6;
            var18 -= var33 * (float)var6;
            var20 -= var34 * (float)var6;
            var22 -= var35 * (float)var6;
            var24 -= var36 * (float)var6;
            var6 = 0;
         }
      }

      if(var6 < var7) {
         var26 = var7 - var6;

         for(var5 += var6; var26-- > 0; var24 += var36) {
            float var37 = 1.0F / var8;
            float var38 = 1.0F / var10;
            if(!var1 || var37 < aFloatArray1739[var5]) {
               int var39 = (int)(var12 * var38 * (float)anInt1752);
               if(aBool1741) {
                  var39 &= anInt1744;
               } else if(var39 < 0) {
                  var39 = 0;
               } else if(var39 > anInt1744) {
                  var39 = anInt1744;
               }

               int var40 = (int)(var14 * var38 * (float)anInt1752);
               if(aBool1741) {
                  var40 &= anInt1744;
               } else if(var40 < 0) {
                  var40 = 0;
               } else if(var40 > anInt1744) {
                  var40 = anInt1744;
               }

               int var41 = anIntArray1725[var40 * anInt1752 + var39];
               //boolean var42 = true;
               int var46;
               if(aClass529_1746 == Class529.aClass529_6944) {
                  var46 = (int)((float)(var41 >> 24 & 255) * var18 / 255.0F);
               } else if(aClass529_1746 == Class529.aClass529_6943) {
                  if((var41 >> 24 & 255) > anInt1747) {
                     var46 = 255;
                  } else {
                     var46 = 0;
                  }
               } else {
                  var46 = (int)var18;
               }

               if(var46 != 0) {
                  int var43;
                  int var44;
                  int var45;
                  if(var46 != 255) {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((anInt1740 & 16711935) * (int)var16 & -16711936 | (anInt1740 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     var44 = var3[var5];
                     var45 = 255 - var46;
                     var43 = ((var44 & 16711935) * var45 + (var43 & 16711935) * var46 & -16711936) + ((var44 & '\uff00') * var45 + (var43 & '\uff00') * var46 & 16711680) >> 8;
                     if(var2) {
                        var3[var5] = (var46 | var3[var5] >> 24) << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        aFloatArray1739[var5] = var37;
                     }
                  } else {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((anInt1740 & 16711935) * (int)var16 & -16711936 | (anInt1740 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     if(var2) {
                        var3[var5] = var46 << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        aFloatArray1739[var5] = var37;
                     }
                  }
               }
            }

            ++var5;
            var8 += var28;
            var10 += var29;
            var12 += var30;
            var14 += var31;
            var16 += var32;
            var18 += var33;
            var20 += var34;
            var22 += var35;
         }

      }
   }

   final void method3354(boolean var1, boolean var2, int[] var3, int[] var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25) {
      int var26 = var7 - var6;
      float var27 = 1.0F / (float)var26;
      float var28 = (var9 - var8) * var27;
      float var29 = (var11 - var10) * var27;
      float var30 = (var13 - var12) * var27;
      float var31 = (var15 - var14) * var27;
      float var32 = (var17 - var16) * var27;
      float var33 = (var19 - var18) * var27;
      float var34 = (var21 - var20) * var27;
      float var35 = (var23 - var22) * var27;
      float var36 = (var25 - var24) * var27;
      if(aBool1748) {
         if(var7 > anInt1733) {
            var7 = anInt1733;
         }

         if(var6 < 0) {
            var8 -= var28 * (float)var6;
            var10 -= var29 * (float)var6;
            var12 -= var30 * (float)var6;
            var14 -= var31 * (float)var6;
            var16 -= var32 * (float)var6;
            var18 -= var33 * (float)var6;
            var20 -= var34 * (float)var6;
            var22 -= var35 * (float)var6;
            var24 -= var36 * (float)var6;
            var6 = 0;
         }
      }

      if(var6 < var7) {
         var26 = var7 - var6;

         for(var5 += var6; var26-- > 0; var24 += var36) {
            float var37 = 1.0F / var8;
            float var38 = 1.0F / var10;
            if(!var1 || var37 < aFloatArray1739[var5]) {
               int var39 = (int)(var12 * var38 * (float)anInt1752);
               if(aBool1741) {
                  var39 &= anInt1744;
               } else if(var39 < 0) {
                  var39 = 0;
               } else if(var39 > anInt1744) {
                  var39 = anInt1744;
               }

               int var40 = (int)(var14 * var38 * (float)anInt1752);
               if(aBool1741) {
                  var40 &= anInt1744;
               } else if(var40 < 0) {
                  var40 = 0;
               } else if(var40 > anInt1744) {
                  var40 = anInt1744;
               }

               int var41 = anIntArray1725[var40 * anInt1752 + var39];
               //boolean var42 = true;
               int var46;
               if(aClass529_1746 == Class529.aClass529_6944) {
                  var46 = (int)((float)(var41 >> 24 & 255) * var18 / 255.0F);
               } else if(aClass529_1746 == Class529.aClass529_6943) {
                  if((var41 >> 24 & 255) > anInt1747) {
                     var46 = 255;
                  } else {
                     var46 = 0;
                  }
               } else {
                  var46 = (int)var18;
               }

               if(var46 != 0) {
                  int var43;
                  int var44;
                  int var45;
                  if(var46 != 255) {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((anInt1740 & 16711935) * (int)var16 & -16711936 | (anInt1740 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     var44 = var3[var5];
                     var45 = 255 - var46;
                     var43 = ((var44 & 16711935) * var45 + (var43 & 16711935) * var46 & -16711936) + ((var44 & '\uff00') * var45 + (var43 & '\uff00') * var46 & 16711680) >> 8;
                     if(var2) {
                        var3[var5] = (var46 | var3[var5] >> 24) << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        aFloatArray1739[var5] = var37;
                     }
                  } else {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((anInt1740 & 16711935) * (int)var16 & -16711936 | (anInt1740 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     if(var2) {
                        var3[var5] = var46 << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        aFloatArray1739[var5] = var37;
                     }
                  }
               }
            }

            ++var5;
            var8 += var28;
            var10 += var29;
            var12 += var30;
            var14 += var31;
            var16 += var32;
            var18 += var33;
            var20 += var34;
            var22 += var35;
         }

      }
   }

   final void method3355(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29, int var30, float var31, int var32, int var33, float var34, int var35, int var36, float var37) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else {
         anInt1740 = var25;
         int var39;
         if(var4 > var5 || var4 > var6) {
            float var38;
            if(var5 <= var6) {
               var38 = var7;
               var7 = var8;
               var8 = var38;
               var38 = var4;
               var4 = var5;
               var5 = var38;
               var38 = var10;
               var10 = var11;
               var11 = var38;
               var38 = var16;
               var16 = var17;
               var17 = var38;
               var38 = var19;
               var19 = var20;
               var20 = var38;
               var38 = var13;
               var13 = var14;
               var14 = var38;
               var38 = var26;
               var26 = var27;
               var27 = var38;
               var38 = var31;
               var31 = var34;
               var34 = var38;
               var39 = var22;
               var22 = var23;
               var23 = var39;
               var39 = var30;
               var30 = var33;
               var33 = var39;
               var39 = var29;
               var29 = var32;
               var32 = var39;
            } else {
               var38 = var7;
               var7 = var9;
               var9 = var38;
               var38 = var4;
               var4 = var6;
               var6 = var38;
               var38 = var10;
               var10 = var12;
               var12 = var38;
               var38 = var16;
               var16 = var18;
               var18 = var38;
               var38 = var19;
               var19 = var21;
               var21 = var38;
               var38 = var13;
               var13 = var15;
               var15 = var38;
               var38 = var26;
               var26 = var28;
               var28 = var38;
               var38 = var31;
               var31 = var37;
               var37 = var38;
               var39 = var22;
               var22 = var24;
               var24 = var39;
               var39 = var30;
               var30 = var36;
               var36 = var39;
               var39 = var29;
               var29 = var35;
               var35 = var39;
            }
         }

         int var98 = (var29 & '\uffff') << 16 | var30 & '\uffff';
         var39 = (var32 & '\uffff') << 16 | var33 & '\uffff';
         int var40 = (var35 & '\uffff') << 16 | var36 & '\uffff';
         int var96;
         int var97;
         if(var98 != anInt1734) {
            anIntArray1725 = aClass103_Sub2_1743.method15389(var29, var30);
            if(anIntArray1725 == null) {
               anInt1734 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var29), 1711635828) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1734 = var98;
            anInt1752 = aClass103_Sub2_1743.method15365(var29);
            anInt1744 = anInt1752 - 1;
            aClass529_1746 = aClass103_Sub2_1743.method15366(var29);
         }

         aFloat1745 = var31;
         if(var39 != anInt1749) {
            anIntArray1750 = aClass103_Sub2_1743.method15389(var32, var33);
            if(anIntArray1750 == null) {
               anInt1749 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var32), -594430289) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1749 = var39;
            anInt1757 = aClass103_Sub2_1743.method15365(var32);
            anInt1742 = anInt1757 - 1;
         }

         aFloat1753 = var34;
         if(var40 != anInt1754) {
            anIntArray1755 = aClass103_Sub2_1743.method15389(var35, var36);
            if(anIntArray1755 == null) {
               anInt1754 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var35), -395807928) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, (float)((int)var4), (float)((int)var5), (float)((int)var6), (float)((int)var7), (float)((int)var8), (float)((int)var9), (float)((int)var10), (float)((int)var11), (float)((int)var12), Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1754 = var40;
            anInt1738 = aClass103_Sub2_1743.method15365(var35);
            anInt1735 = anInt1738 - 1;
         }

         aFloat1758 = var37;
         var16 /= var13;
         var17 /= var14;
         var18 /= var15;
         var19 /= var13;
         var20 /= var14;
         var21 /= var15;
         var10 = 1.0F / var10;
         var11 = 1.0F / var11;
         var12 = 1.0F / var12;
         var13 = 1.0F / var13;
         var14 = 1.0F / var14;
         var15 = 1.0F / var15;
         float var41 = (float)(var22 >> 24 & 255);
         float var42 = (float)(var23 >> 24 & 255);
         float var43 = (float)(var24 >> 24 & 255);
         float var44 = (float)(var22 >> 16 & 255);
         float var45 = (float)(var23 >> 16 & 255);
         float var46 = (float)(var24 >> 16 & 255);
         float var47 = (float)(var22 >> 8 & 255);
         float var48 = (float)(var23 >> 8 & 255);
         float var49 = (float)(var24 >> 8 & 255);
         float var50 = (float)(var22 & 255);
         float var51 = (float)(var23 & 255);
         float var52 = (float)(var24 & 255);
         float var53 = 1.0F;
         float var54 = 0.0F;
         float var55 = 0.0F;
         float var56 = 0.0F;
         float var57 = 1.0F;
         float var58 = 0.0F;
         float var59 = 0.0F;
         float var60 = 0.0F;
         float var61 = 0.0F;
         float var62 = 0.0F;
         float var63 = 0.0F;
         float var64 = 0.0F;
         float var65 = 0.0F;
         float var66 = 0.0F;
         float var67 = 0.0F;
         float var68 = 0.0F;
         float var69 = 0.0F;
         float var70 = 0.0F;
         float var71;
         if(var5 != var4) {
            var71 = var5 - var4;
            var59 = (var8 - var7) / var71;
            var60 = (var11 - var10) / var71;
            var61 = (var14 - var13) / var71;
            var62 = (var17 - var16) / var71;
            var63 = (var20 - var19) / var71;
            var64 = (var27 - var26) / var71;
            var65 = (var42 - var41) / var71;
            var66 = (var45 - var44) / var71;
            var67 = (var48 - var47) / var71;
            var68 = (var51 - var50) / var71;
            var69 = (var54 - var53) / var71;
            var70 = (var57 - var56) / var71;
         }

         var71 = 0.0F;
         float var72 = 0.0F;
         float var73 = 0.0F;
         float var74 = 0.0F;
         float var75 = 0.0F;
         float var76 = 0.0F;
         float var77 = 0.0F;
         float var78 = 0.0F;
         float var79 = 0.0F;
         float var80 = 0.0F;
         float var81 = 0.0F;
         float var82 = 0.0F;
         float var83;
         if(var6 != var5) {
            var83 = var6 - var5;
            var71 = (var9 - var8) / var83;
            var72 = (var12 - var11) / var83;
            var73 = (var15 - var14) / var83;
            var74 = (var18 - var17) / var83;
            var75 = (var21 - var20) / var83;
            var76 = (var28 - var27) / var83;
            var77 = (var43 - var42) / var83;
            var78 = (var46 - var45) / var83;
            var79 = (var49 - var48) / var83;
            var80 = (var52 - var51) / var83;
            var81 = (var55 - var54) / var83;
            var82 = (var58 - var57) / var83;
         }

         var83 = 0.0F;
         float var84 = 0.0F;
         float var85 = 0.0F;
         float var86 = 0.0F;
         float var87 = 0.0F;
         float var88 = 0.0F;
         float var89 = 0.0F;
         float var90 = 0.0F;
         float var91 = 0.0F;
         float var92 = 0.0F;
         float var93 = 0.0F;
         float var94 = 0.0F;
         if(var4 != var6) {
            float var95 = var4 - var6;
            var83 = (var7 - var9) / var95;
            var84 = (var10 - var12) / var95;
            var85 = (var13 - var15) / var95;
            var86 = (var16 - var18) / var95;
            var87 = (var19 - var21) / var95;
            var88 = (var26 - var28) / var95;
            var89 = (var41 - var43) / var95;
            var90 = (var44 - var46) / var95;
            var91 = (var47 - var49) / var95;
            var92 = (var50 - var52) / var95;
            var93 = (var53 - var55) / var95;
            var94 = (var56 - var58) / var95;
         }

         if(var4 < (float)anInt1726) {
            if(var5 > (float)anInt1726) {
               var5 = (float)anInt1726;
            }

            if(var6 > (float)anInt1726) {
               var6 = (float)anInt1726;
            }

            if(var5 < var6) {
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var21 = var19;
               var28 = var26;
               var43 = var41;
               var46 = var44;
               var49 = var47;
               var52 = var50;
               var55 = var53;
               var58 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var9 -= var83 * var4;
                  var10 -= var60 * var4;
                  var12 -= var84 * var4;
                  var13 -= var61 * var4;
                  var15 -= var85 * var4;
                  var16 -= var62 * var4;
                  var18 -= var86 * var4;
                  var19 -= var63 * var4;
                  var21 -= var87 * var4;
                  var26 -= var64 * var4;
                  var28 -= var88 * var4;
                  var41 -= var65 * var4;
                  var43 -= var89 * var4;
                  var44 -= var66 * var4;
                  var46 -= var90 * var4;
                  var47 -= var67 * var4;
                  var49 -= var91 * var4;
                  var50 -= var68 * var4;
                  var52 -= var92 * var4;
                  var53 -= var69 * var4;
                  var55 -= var93 * var4;
                  var56 -= var70 * var4;
                  var58 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var5 < 0.0F) {
                  var8 -= var71 * var5;
                  var11 -= var72 * var5;
                  var14 -= var73 * var5;
                  var17 -= var74 * var5;
                  var20 -= var75 * var5;
                  var27 -= var76 * var5;
                  var42 -= var77 * var5;
                  var45 -= var78 * var5;
                  var48 -= var79 * var5;
                  var51 -= var80 * var5;
                  var54 -= var81 * var5;
                  var57 -= var82 * var5;
                  var5 = 0.0F;
               }

               if((var4 == var5 || var83 >= var59) && (var4 != var5 || var83 <= var71)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var8, (int)var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var42, var43, var45, var46, var48, var49, var51, var52, var54, var55, var57, var58);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var43, var42, var46, var45, var49, var48, var52, var51, var55, var54, var58, var57);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)anInt1737;
                  }
               }
            } else {
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var20 = var19;
               var27 = var26;
               var42 = var41;
               var45 = var44;
               var48 = var47;
               var51 = var50;
               var54 = var53;
               var57 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var8 -= var83 * var4;
                  var10 -= var60 * var4;
                  var11 -= var84 * var4;
                  var13 -= var61 * var4;
                  var14 -= var85 * var4;
                  var16 -= var62 * var4;
                  var17 -= var86 * var4;
                  var19 -= var63 * var4;
                  var20 -= var87 * var4;
                  var26 -= var64 * var4;
                  var27 -= var88 * var4;
                  var41 -= var65 * var4;
                  var42 -= var89 * var4;
                  var44 -= var66 * var4;
                  var45 -= var90 * var4;
                  var47 -= var67 * var4;
                  var48 -= var91 * var4;
                  var50 -= var68 * var4;
                  var51 -= var92 * var4;
                  var53 -= var69 * var4;
                  var54 -= var93 * var4;
                  var56 -= var70 * var4;
                  var57 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var6 < 0.0F) {
                  var9 -= var71 * var6;
                  var12 -= var72 * var6;
                  var15 -= var73 * var6;
                  var18 -= var74 * var6;
                  var21 -= var75 * var6;
                  var28 -= var76 * var6;
                  var43 -= var77 * var6;
                  var46 -= var78 * var6;
                  var49 -= var79 * var6;
                  var52 -= var80 * var6;
                  var55 -= var81 * var6;
                  var58 -= var82 * var6;
                  var6 = 0.0F;
               }

               if((var4 == var6 || var83 >= var59) && (var4 != var6 || var71 <= var59)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var41, var42, var44, var45, var47, var48, var50, var51, var53, var54, var56, var57);
                     var8 += var83;
                     var7 += var59;
                     var11 += var84;
                     var10 += var60;
                     var14 += var85;
                     var13 += var61;
                     var17 += var86;
                     var16 += var62;
                     var20 += var87;
                     var19 += var63;
                     var27 += var88;
                     var26 += var64;
                     var42 += var89;
                     var41 += var65;
                     var45 += var90;
                     var44 += var66;
                     var48 += var91;
                     var47 += var67;
                     var51 += var92;
                     var50 += var68;
                     var54 += var93;
                     var53 += var69;
                     var57 += var94;
                     var56 += var70;
                  }

                  while(--var5 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var71;
                     var10 += var60;
                     var12 += var72;
                     var13 += var61;
                     var15 += var73;
                     var16 += var62;
                     var18 += var74;
                     var19 += var63;
                     var21 += var75;
                     var26 += var64;
                     var28 += var76;
                     var41 += var65;
                     var43 += var77;
                     var44 += var66;
                     var46 += var78;
                     var47 += var67;
                     var49 += var79;
                     var50 += var68;
                     var52 += var80;
                     var53 += var69;
                     var55 += var81;
                     var56 += var70;
                     var58 += var82;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var8, (int)var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var42, var41, var45, var44, var48, var47, var51, var50, var54, var53, var57, var56);
                     var7 += var59;
                     var8 += var83;
                     var10 += var60;
                     var11 += var84;
                     var13 += var61;
                     var14 += var85;
                     var16 += var62;
                     var17 += var86;
                     var19 += var63;
                     var20 += var87;
                     var26 += var64;
                     var27 += var88;
                     var41 += var65;
                     var42 += var89;
                     var44 += var66;
                     var45 += var90;
                     var47 += var67;
                     var48 += var91;
                     var50 += var68;
                     var51 += var92;
                     var53 += var69;
                     var54 += var93;
                     var56 += var70;
                     var57 += var94;
                  }

                  while(--var5 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var9 += var71;
                     var7 += var59;
                     var12 += var72;
                     var10 += var60;
                     var15 += var73;
                     var13 += var61;
                     var18 += var74;
                     var16 += var62;
                     var21 += var75;
                     var19 += var63;
                     var28 += var76;
                     var26 += var64;
                     var43 += var77;
                     var41 += var65;
                     var46 += var78;
                     var44 += var66;
                     var49 += var79;
                     var47 += var67;
                     var52 += var80;
                     var50 += var68;
                     var55 += var81;
                     var53 += var69;
                     var58 += var82;
                     var56 += var70;
                     var4 += (float)anInt1737;
                  }
               }
            }

         }
      }
   }

   int method3356() {
      return anIntArray1730[0] % anInt1737;
   }

   int method3357() {
      return anIntArray1730[0] % anInt1737;
   }

   int method3358() {
      return anIntArray1730[0] / anInt1737;
   }

   int method3359() {
      return anIntArray1730[0] / anInt1737;
   }

   final void method3360(boolean var1) {
      aBool1724 = var1;
   }

   final void method3361(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else if(aBool1724) {
         aClass103_Sub2_1743.method2517((int)var7, (int)var4, (int)var8, (int)var5, Class474.anIntArray6382[(int)var13 & '\uffff'], 223909001);
         aClass103_Sub2_1743.method2517((int)var8, (int)var5, (int)var9, (int)var6, Class474.anIntArray6382[(int)var13 & '\uffff'], 223909001);
         aClass103_Sub2_1743.method2517((int)var9, (int)var6, (int)var7, (int)var4, Class474.anIntArray6382[(int)var13 & '\uffff'], 223909001);
      } else {
         float var16 = var8 - var7;
         float var17 = var5 - var4;
         float var18 = var9 - var7;
         float var19 = var6 - var4;
         float var20 = var14 - var13;
         float var21 = var15 - var13;
         float var22 = var11 - var10;
         float var23 = var12 - var10;
         float var24;
         if(var6 != var5) {
            var24 = (var9 - var8) / (var6 - var5);
         } else {
            var24 = 0.0F;
         }

         float var25;
         if(var5 != var4) {
            var25 = var16 / var17;
         } else {
            var25 = 0.0F;
         }

         float var26;
         if(var6 != var4) {
            var26 = var18 / var19;
         } else {
            var26 = 0.0F;
         }

         float var27 = var16 * var19 - var18 * var17;
         if(var27 != 0.0F) {
            float var28 = (var20 * var19 - var21 * var17) / var27;
            float var29 = (var21 * var16 - var20 * var18) / var27;
            float var30 = (var22 * var19 - var23 * var17) / var27;
            float var31 = (var23 * var16 - var22 * var18) / var27;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)anInt1726) {
                  if(var5 > (float)anInt1726) {
                     var5 = (float)anInt1726;
                  }

                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  var13 = var13 - var28 * var7 + var28;
                  var10 = var10 - var30 * var7 + var30;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var26 * var4;
                        var7 -= var25 * var4;
                        var13 -= var29 * var4;
                        var10 -= var31 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var24 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var26 >= var25) && (var4 != var5 || var26 <= var24)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var13, var28, var10, var30);
                           var9 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var9, var13, var28, var10, var30);
                           var9 += var26;
                           var8 += var24;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var13, var28, var10, var30);
                           var9 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var8, var13, var28, var10, var30);
                           var9 += var26;
                           var8 += var24;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var26 * var4;
                        var7 -= var25 * var4;
                        var13 -= var29 * var4;
                        var10 -= var31 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var24 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var26 >= var25) && (var4 != var6 || var24 <= var25)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var8, var13, var28, var10, var30);
                           var8 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var5 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var13, var28, var10, var30);
                           var9 += var24;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var7, var13, var28, var10, var30);
                           var8 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var5 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var13, var28, var10, var30);
                           var9 += var24;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)anInt1726) {
                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  if(var4 > (float)anInt1726) {
                     var4 = (float)anInt1726;
                  }

                  var14 = var14 - var28 * var8 + var28;
                  var11 = var11 - var30 * var8 + var30;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var25 * var5;
                        var8 -= var24 * var5;
                        var14 -= var29 * var5;
                        var11 -= var31 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var26 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var25 >= var24) && (var5 != var6 || var25 <= var26)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var14, var28, var11, var30);
                           var7 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var4 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var7, var14, var28, var11, var30);
                           var7 += var25;
                           var9 += var26;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var14, var28, var11, var30);
                           var7 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var4 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var9, var14, var28, var11, var30);
                           var7 += var25;
                           var9 += var26;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var25 * var5;
                        var8 -= var24 * var5;
                        var14 -= var29 * var5;
                        var11 -= var31 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var26 * var4;
                        var4 = 0.0F;
                     }

                     if(var25 < var24) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var8, var14, var28, var11, var30);
                           var9 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var14, var28, var11, var30);
                           var7 += var26;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var9, var14, var28, var11, var30);
                           var9 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var14, var28, var11, var30);
                           var7 += var26;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var6 < (float)anInt1726) {
               if(var4 > (float)anInt1726) {
                  var4 = (float)anInt1726;
               }

               if(var5 > (float)anInt1726) {
                  var5 = (float)anInt1726;
               }

               var15 = var15 - var28 * var9 + var28;
               var12 = var12 - var30 * var9 + var30;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var24 * var6;
                     var9 -= var26 * var6;
                     var15 -= var29 * var6;
                     var12 -= var31 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var25 * var4;
                     var4 = 0.0F;
                  }

                  if(var24 < var26) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var15, var28, var12, var30);
                        var8 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var5 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var7, var15, var28, var12, var30);
                        var8 += var24;
                        var7 += var25;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var15, var28, var12, var30);
                        var8 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var5 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var8, var15, var28, var12, var30);
                        var8 += var24;
                        var7 += var25;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var24 * var6;
                     var9 -= var26 * var6;
                     var15 -= var29 * var6;
                     var12 -= var31 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var25 * var5;
                     var5 = 0.0F;
                  }

                  if(var24 < var26) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var9, var15, var28, var12, var30);
                        var7 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var4 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var15, var28, var12, var30);
                        var8 += var25;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var7, var15, var28, var12, var30);
                        var7 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var4 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var15, var28, var12, var30);
                        var8 += var25;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  }
               }
            }
         }
      }
   }

   final void method3362(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else if(aBool1724) {
         aClass103_Sub2_1743.method2517((int)var7, (int)var4, (int)var8, (int)var5, Class474.anIntArray6382[(int)var13 & '\uffff'], 223909001);
         aClass103_Sub2_1743.method2517((int)var8, (int)var5, (int)var9, (int)var6, Class474.anIntArray6382[(int)var13 & '\uffff'], 223909001);
         aClass103_Sub2_1743.method2517((int)var9, (int)var6, (int)var7, (int)var4, Class474.anIntArray6382[(int)var13 & '\uffff'], 223909001);
      } else {
         float var16 = var8 - var7;
         float var17 = var5 - var4;
         float var18 = var9 - var7;
         float var19 = var6 - var4;
         float var20 = var14 - var13;
         float var21 = var15 - var13;
         float var22 = var11 - var10;
         float var23 = var12 - var10;
         float var24;
         if(var6 != var5) {
            var24 = (var9 - var8) / (var6 - var5);
         } else {
            var24 = 0.0F;
         }

         float var25;
         if(var5 != var4) {
            var25 = var16 / var17;
         } else {
            var25 = 0.0F;
         }

         float var26;
         if(var6 != var4) {
            var26 = var18 / var19;
         } else {
            var26 = 0.0F;
         }

         float var27 = var16 * var19 - var18 * var17;
         if(var27 != 0.0F) {
            float var28 = (var20 * var19 - var21 * var17) / var27;
            float var29 = (var21 * var16 - var20 * var18) / var27;
            float var30 = (var22 * var19 - var23 * var17) / var27;
            float var31 = (var23 * var16 - var22 * var18) / var27;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)anInt1726) {
                  if(var5 > (float)anInt1726) {
                     var5 = (float)anInt1726;
                  }

                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  var13 = var13 - var28 * var7 + var28;
                  var10 = var10 - var30 * var7 + var30;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var26 * var4;
                        var7 -= var25 * var4;
                        var13 -= var29 * var4;
                        var10 -= var31 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var24 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var26 >= var25) && (var4 != var5 || var26 <= var24)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var13, var28, var10, var30);
                           var9 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var9, var13, var28, var10, var30);
                           var9 += var26;
                           var8 += var24;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var13, var28, var10, var30);
                           var9 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var8, var13, var28, var10, var30);
                           var9 += var26;
                           var8 += var24;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var26 * var4;
                        var7 -= var25 * var4;
                        var13 -= var29 * var4;
                        var10 -= var31 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var24 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var26 >= var25) && (var4 != var6 || var24 <= var25)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var8, var13, var28, var10, var30);
                           var8 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var5 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var13, var28, var10, var30);
                           var9 += var24;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var7, var13, var28, var10, var30);
                           var8 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var5 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var13, var28, var10, var30);
                           var9 += var24;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)anInt1726) {
                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  if(var4 > (float)anInt1726) {
                     var4 = (float)anInt1726;
                  }

                  var14 = var14 - var28 * var8 + var28;
                  var11 = var11 - var30 * var8 + var30;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var25 * var5;
                        var8 -= var24 * var5;
                        var14 -= var29 * var5;
                        var11 -= var31 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var26 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var25 >= var24) && (var5 != var6 || var25 <= var26)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var14, var28, var11, var30);
                           var7 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var4 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var7, var14, var28, var11, var30);
                           var7 += var25;
                           var9 += var26;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var14, var28, var11, var30);
                           var7 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var4 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var9, var14, var28, var11, var30);
                           var7 += var25;
                           var9 += var26;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var25 * var5;
                        var8 -= var24 * var5;
                        var14 -= var29 * var5;
                        var11 -= var31 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var26 * var4;
                        var4 = 0.0F;
                     }

                     if(var25 < var24) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var8, var14, var28, var11, var30);
                           var9 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var14, var28, var11, var30);
                           var7 += var26;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var9, var14, var28, var11, var30);
                           var9 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var14, var28, var11, var30);
                           var7 += var26;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var6 < (float)anInt1726) {
               if(var4 > (float)anInt1726) {
                  var4 = (float)anInt1726;
               }

               if(var5 > (float)anInt1726) {
                  var5 = (float)anInt1726;
               }

               var15 = var15 - var28 * var9 + var28;
               var12 = var12 - var30 * var9 + var30;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var24 * var6;
                     var9 -= var26 * var6;
                     var15 -= var29 * var6;
                     var12 -= var31 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var25 * var4;
                     var4 = 0.0F;
                  }

                  if(var24 < var26) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var15, var28, var12, var30);
                        var8 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var5 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var7, var15, var28, var12, var30);
                        var8 += var24;
                        var7 += var25;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var15, var28, var12, var30);
                        var8 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var5 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var8, var15, var28, var12, var30);
                        var8 += var24;
                        var7 += var25;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var24 * var6;
                     var9 -= var26 * var6;
                     var15 -= var29 * var6;
                     var12 -= var31 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var25 * var5;
                     var5 = 0.0F;
                  }

                  if(var24 < var26) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var9, var15, var28, var12, var30);
                        var7 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var4 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var15, var28, var12, var30);
                        var8 += var25;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var7, var15, var28, var12, var30);
                        var7 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var4 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var15, var28, var12, var30);
                        var8 += var25;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  }
               }
            }
         }
      }
   }

   final void method3363(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12) {
      if(aBool1748) {
         if(var8 > anInt1733) {
            var8 = anInt1733;
         }

         if(var7 < 0) {
            var7 = 0;
         }
      }

      if(var7 < var8) {
         var4 += var7 - 1;
         var9 += var10 * (float)var7;
         var11 += var12 * (float)var7;
         int var13;
         int var14;
         int var15;
         if(aClass189_1736.aBool2220) {
            if(aBool1721) {
               var6 = var8 - var7 >> 2;
               var10 *= 4.0F;
               if(anInt1723 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var9 += var10;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];

                     do {
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  var13 = anInt1723;
                  var14 = 256 - anInt1723;
                  if(var6 > 0) {
                     do {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var9 += var10;
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                     do {
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               }
            } else {
               var6 = var8 - var7;
               if(anInt1723 == 0) {
                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        if(var1) {
                           aFloatArray1739[var4] = var11;
                        }
                     }

                     var11 += var12;
                     var9 += var10;
                     --var6;
                  } while(var6 > 0);
               } else {
                  var13 = anInt1723;
                  var14 = 256 - anInt1723;

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }

                        if(var1) {
                           aFloatArray1739[var4] = var11;
                        }
                     }

                     var9 += var10;
                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else if(aBool1721) {
            var6 = var8 - var7 >> 2;
            var10 *= 4.0F;
            if(anInt1723 == 0) {
               if(var6 > 0) {
                  do {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var9 += var10;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            } else {
               var13 = anInt1723;
               var14 = 256 - anInt1723;
               if(var6 > 0) {
                  do {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var9 += var10;
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                  var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else {
            var6 = var8 - var7;
            if(anInt1723 == 0) {
               do {
                  ++var4;
                  if(!var1 || var11 < aFloatArray1739[var4]) {
                     var3[var4] = Class474.anIntArray6382[(int)var9 & '\uffff'];
                  }

                  var11 += var12;
                  var9 += var10;
                  --var6;
               } while(var6 > 0);
            } else {
               var13 = anInt1723;
               var14 = 256 - anInt1723;

               do {
                  ++var4;
                  if(!var1 || var11 < aFloatArray1739[var4]) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     var15 = var3[var4];
                     if(var2) {
                        var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     } else {
                        var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     }
                  }

                  var9 += var10;
                  var11 += var12;
                  --var6;
               } while(var6 > 0);
            }
         }

      }
   }

   final void method3364(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12) {
      if(aBool1748) {
         if(var8 > anInt1733) {
            var8 = anInt1733;
         }

         if(var7 < 0) {
            var7 = 0;
         }
      }

      if(var7 < var8) {
         var4 += var7 - 1;
         var9 += var10 * (float)var7;
         var11 += var12 * (float)var7;
         int var13;
         int var14;
         int var15;
         if(aClass189_1736.aBool2220) {
            if(aBool1721) {
               var6 = var8 - var7 >> 2;
               var10 *= 4.0F;
               if(anInt1723 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var9 += var10;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];

                     do {
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  var13 = anInt1723;
                  var14 = 256 - anInt1723;
                  if(var6 > 0) {
                     do {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var9 += var10;
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                     do {
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               }
            } else {
               var6 = var8 - var7;
               if(anInt1723 == 0) {
                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        if(var1) {
                           aFloatArray1739[var4] = var11;
                        }
                     }

                     var11 += var12;
                     var9 += var10;
                     --var6;
                  } while(var6 > 0);
               } else {
                  var13 = anInt1723;
                  var14 = 256 - anInt1723;

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }

                        if(var1) {
                           aFloatArray1739[var4] = var11;
                        }
                     }

                     var9 += var10;
                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else if(aBool1721) {
            var6 = var8 - var7 >> 2;
            var10 *= 4.0F;
            if(anInt1723 == 0) {
               if(var6 > 0) {
                  do {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var9 += var10;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            } else {
               var13 = anInt1723;
               var14 = 256 - anInt1723;
               if(var6 > 0) {
                  do {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var9 += var10;
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                  var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else {
            var6 = var8 - var7;
            if(anInt1723 == 0) {
               do {
                  ++var4;
                  if(!var1 || var11 < aFloatArray1739[var4]) {
                     var3[var4] = Class474.anIntArray6382[(int)var9 & '\uffff'];
                  }

                  var11 += var12;
                  var9 += var10;
                  --var6;
               } while(var6 > 0);
            } else {
               var13 = anInt1723;
               var14 = 256 - anInt1723;

               do {
                  ++var4;
                  if(!var1 || var11 < aFloatArray1739[var4]) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     var15 = var3[var4];
                     if(var2) {
                        var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     } else {
                        var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     }
                  }

                  var9 += var10;
                  var11 += var12;
                  --var6;
               } while(var6 > 0);
            }
         }

      }
   }

   final void method3365(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12) {
      if(aBool1748) {
         if(var8 > anInt1733) {
            var8 = anInt1733;
         }

         if(var7 < 0) {
            var7 = 0;
         }
      }

      if(var7 < var8) {
         var4 += var7 - 1;
         var9 += var10 * (float)var7;
         var11 += var12 * (float)var7;
         int var13;
         int var14;
         int var15;
         if(aClass189_1736.aBool2220) {
            if(aBool1721) {
               var6 = var8 - var7 >> 2;
               var10 *= 4.0F;
               if(anInt1723 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var9 += var10;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];

                     do {
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  var13 = anInt1723;
                  var14 = 256 - anInt1723;
                  if(var6 > 0) {
                     do {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var9 += var10;
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                     do {
                        ++var4;
                        if(!var1 || var11 < aFloatArray1739[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               }
            } else {
               var6 = var8 - var7;
               if(anInt1723 == 0) {
                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        if(var1) {
                           aFloatArray1739[var4] = var11;
                        }
                     }

                     var11 += var12;
                     var9 += var10;
                     --var6;
                  } while(var6 > 0);
               } else {
                  var13 = anInt1723;
                  var14 = 256 - anInt1723;

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }

                        if(var1) {
                           aFloatArray1739[var4] = var11;
                        }
                     }

                     var9 += var10;
                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else if(aBool1721) {
            var6 = var8 - var7 >> 2;
            var10 *= 4.0F;
            if(anInt1723 == 0) {
               if(var6 > 0) {
                  do {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var9 += var10;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            } else {
               var13 = anInt1723;
               var14 = 256 - anInt1723;
               if(var6 > 0) {
                  do {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var9 += var10;
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                  var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                  do {
                     ++var4;
                     if(!var1 || var11 < aFloatArray1739[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else {
            var6 = var8 - var7;
            if(anInt1723 == 0) {
               do {
                  ++var4;
                  if(!var1 || var11 < aFloatArray1739[var4]) {
                     var3[var4] = Class474.anIntArray6382[(int)var9 & '\uffff'];
                  }

                  var11 += var12;
                  var9 += var10;
                  --var6;
               } while(var6 > 0);
            } else {
               var13 = anInt1723;
               var14 = 256 - anInt1723;

               do {
                  ++var4;
                  if(!var1 || var11 < aFloatArray1739[var4]) {
                     var5 = Class474.anIntArray6382[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     var15 = var3[var4];
                     if(var2) {
                        var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     } else {
                        var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     }
                  }

                  var9 += var10;
                  var11 += var12;
                  --var6;
               } while(var6 > 0);
            }
         }

      }
   }

   final void method3366(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13, int var14, int var15) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else if(aBool1724) {
         aClass103_Sub2_1743.method2517((int)var7, (int)var4, (int)var8, (int)var5, -16777216 | var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var8, (int)var5, (int)var9, (int)var6, -16777216 | var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var9, (int)var6, (int)var7, (int)var4, -16777216 | var13, 223909001);
      } else {
         float var16 = var8 - var7;
         float var17 = var5 - var4;
         float var18 = var9 - var7;
         float var19 = var6 - var4;
         float var20 = var11 - var10;
         float var21 = var12 - var10;
         float var22 = (float)((var14 & 16711680) - (var13 & 16711680));
         float var23 = (float)((var15 & 16711680) - (var13 & 16711680));
         float var24 = (float)((var14 & '\uff00') - (var13 & '\uff00'));
         float var25 = (float)((var15 & '\uff00') - (var13 & '\uff00'));
         float var26 = (float)((var14 & 255) - (var13 & 255));
         float var27 = (float)((var15 & 255) - (var13 & 255));
         float var28;
         if(var6 != var5) {
            var28 = (var9 - var8) / (var6 - var5);
         } else {
            var28 = 0.0F;
         }

         float var29;
         if(var5 != var4) {
            var29 = var16 / var17;
         } else {
            var29 = 0.0F;
         }

         float var30;
         if(var6 != var4) {
            var30 = var18 / var19;
         } else {
            var30 = 0.0F;
         }

         float var31 = var16 * var19 - var18 * var17;
         if(var31 != 0.0F) {
            float var32 = (var20 * var19 - var21 * var17) / var31;
            float var33 = (var21 * var16 - var20 * var18) / var31;
            float var34 = (var22 * var19 - var23 * var17) / var31;
            float var35 = (var23 * var16 - var22 * var18) / var31;
            float var36 = (var24 * var19 - var25 * var17) / var31;
            float var37 = (var25 * var16 - var24 * var18) / var31;
            float var38 = (var26 * var19 - var27 * var17) / var31;
            float var39 = (var27 * var16 - var26 * var18) / var31;
            float var42;
            float var40;
            float var41;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)anInt1726) {
                  if(var5 > (float)anInt1726) {
                     var5 = (float)anInt1726;
                  }

                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  var10 = var10 - var32 * var7 + var32;
                  var40 = (float)(var13 & 16711680) - var34 * var7 + var34;
                  var41 = (float)(var13 & '\uff00') - var36 * var7 + var36;
                  var42 = (float)(var13 & 255) - var38 * var7 + var38;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var28 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var30 >= var29) && (var4 != var5 || var30 <= var28)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var28 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var30 >= var29) && (var4 != var6 || var28 <= var29)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)anInt1726) {
                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  if(var4 > (float)anInt1726) {
                     var4 = (float)anInt1726;
                  }

                  var11 = var11 - var32 * var8 + var32;
                  var40 = (float)(var14 & 16711680) - var34 * var8 + var34;
                  var41 = (float)(var14 & '\uff00') - var36 * var8 + var36;
                  var42 = (float)(var14 & 255) - var38 * var8 + var38;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var30 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var29 >= var28) && (var5 != var6 || var29 <= var30)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var30 * var4;
                        var4 = 0.0F;
                     }

                     if(var29 < var28) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var6 < (float)anInt1726) {
               if(var4 > (float)anInt1726) {
                  var4 = (float)anInt1726;
               }

               if(var5 > (float)anInt1726) {
                  var5 = (float)anInt1726;
               }

               var12 = var12 - var32 * var9 + var32;
               var40 = (float)(var15 & 16711680) - var34 * var9 + var34;
               var41 = (float)(var15 & '\uff00') - var36 * var9 + var36;
               var42 = (float)(var15 & 255) - var38 * var9 + var38;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var29 * var4;
                     var4 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var29 * var5;
                     var5 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  }
               }
            }
         }
      }
   }

   final void method3367(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13, int var14, int var15) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else if(aBool1724) {
         aClass103_Sub2_1743.method2517((int)var7, (int)var4, (int)var8, (int)var5, -16777216 | var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var8, (int)var5, (int)var9, (int)var6, -16777216 | var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var9, (int)var6, (int)var7, (int)var4, -16777216 | var13, 223909001);
      } else {
         float var16 = var8 - var7;
         float var17 = var5 - var4;
         float var18 = var9 - var7;
         float var19 = var6 - var4;
         float var20 = var11 - var10;
         float var21 = var12 - var10;
         float var22 = (float)((var14 & 16711680) - (var13 & 16711680));
         float var23 = (float)((var15 & 16711680) - (var13 & 16711680));
         float var24 = (float)((var14 & '\uff00') - (var13 & '\uff00'));
         float var25 = (float)((var15 & '\uff00') - (var13 & '\uff00'));
         float var26 = (float)((var14 & 255) - (var13 & 255));
         float var27 = (float)((var15 & 255) - (var13 & 255));
         float var28;
         if(var6 != var5) {
            var28 = (var9 - var8) / (var6 - var5);
         } else {
            var28 = 0.0F;
         }

         float var29;
         if(var5 != var4) {
            var29 = var16 / var17;
         } else {
            var29 = 0.0F;
         }

         float var30;
         if(var6 != var4) {
            var30 = var18 / var19;
         } else {
            var30 = 0.0F;
         }

         float var31 = var16 * var19 - var18 * var17;
         if(var31 != 0.0F) {
            float var32 = (var20 * var19 - var21 * var17) / var31;
            float var33 = (var21 * var16 - var20 * var18) / var31;
            float var34 = (var22 * var19 - var23 * var17) / var31;
            float var35 = (var23 * var16 - var22 * var18) / var31;
            float var36 = (var24 * var19 - var25 * var17) / var31;
            float var37 = (var25 * var16 - var24 * var18) / var31;
            float var38 = (var26 * var19 - var27 * var17) / var31;
            float var39 = (var27 * var16 - var26 * var18) / var31;
            float var42;
            float var40;
            float var41;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)anInt1726) {
                  if(var5 > (float)anInt1726) {
                     var5 = (float)anInt1726;
                  }

                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  var10 = var10 - var32 * var7 + var32;
                  var40 = (float)(var13 & 16711680) - var34 * var7 + var34;
                  var41 = (float)(var13 & '\uff00') - var36 * var7 + var36;
                  var42 = (float)(var13 & 255) - var38 * var7 + var38;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var28 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var30 >= var29) && (var4 != var5 || var30 <= var28)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var28 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var30 >= var29) && (var4 != var6 || var28 <= var29)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)anInt1726) {
                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  if(var4 > (float)anInt1726) {
                     var4 = (float)anInt1726;
                  }

                  var11 = var11 - var32 * var8 + var32;
                  var40 = (float)(var14 & 16711680) - var34 * var8 + var34;
                  var41 = (float)(var14 & '\uff00') - var36 * var8 + var36;
                  var42 = (float)(var14 & 255) - var38 * var8 + var38;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var30 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var29 >= var28) && (var5 != var6 || var29 <= var30)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var30 * var4;
                        var4 = 0.0F;
                     }

                     if(var29 < var28) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var6 < (float)anInt1726) {
               if(var4 > (float)anInt1726) {
                  var4 = (float)anInt1726;
               }

               if(var5 > (float)anInt1726) {
                  var5 = (float)anInt1726;
               }

               var12 = var12 - var32 * var9 + var32;
               var40 = (float)(var15 & 16711680) - var34 * var9 + var34;
               var41 = (float)(var15 & '\uff00') - var36 * var9 + var36;
               var42 = (float)(var15 & 255) - var38 * var9 + var38;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var29 * var4;
                     var4 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var29 * var5;
                     var5 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  }
               }
            }
         }
      }
   }

   final void method3368(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13, int var14, int var15) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else if(aBool1724) {
         aClass103_Sub2_1743.method2517((int)var7, (int)var4, (int)var8, (int)var5, -16777216 | var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var8, (int)var5, (int)var9, (int)var6, -16777216 | var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var9, (int)var6, (int)var7, (int)var4, -16777216 | var13, 223909001);
      } else {
         float var16 = var8 - var7;
         float var17 = var5 - var4;
         float var18 = var9 - var7;
         float var19 = var6 - var4;
         float var20 = var11 - var10;
         float var21 = var12 - var10;
         float var22 = (float)((var14 & 16711680) - (var13 & 16711680));
         float var23 = (float)((var15 & 16711680) - (var13 & 16711680));
         float var24 = (float)((var14 & '\uff00') - (var13 & '\uff00'));
         float var25 = (float)((var15 & '\uff00') - (var13 & '\uff00'));
         float var26 = (float)((var14 & 255) - (var13 & 255));
         float var27 = (float)((var15 & 255) - (var13 & 255));
         float var28;
         if(var6 != var5) {
            var28 = (var9 - var8) / (var6 - var5);
         } else {
            var28 = 0.0F;
         }

         float var29;
         if(var5 != var4) {
            var29 = var16 / var17;
         } else {
            var29 = 0.0F;
         }

         float var30;
         if(var6 != var4) {
            var30 = var18 / var19;
         } else {
            var30 = 0.0F;
         }

         float var31 = var16 * var19 - var18 * var17;
         if(var31 != 0.0F) {
            float var32 = (var20 * var19 - var21 * var17) / var31;
            float var33 = (var21 * var16 - var20 * var18) / var31;
            float var34 = (var22 * var19 - var23 * var17) / var31;
            float var35 = (var23 * var16 - var22 * var18) / var31;
            float var36 = (var24 * var19 - var25 * var17) / var31;
            float var37 = (var25 * var16 - var24 * var18) / var31;
            float var38 = (var26 * var19 - var27 * var17) / var31;
            float var39 = (var27 * var16 - var26 * var18) / var31;
            float var42;
            float var40;
            float var41;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)anInt1726) {
                  if(var5 > (float)anInt1726) {
                     var5 = (float)anInt1726;
                  }

                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  var10 = var10 - var32 * var7 + var32;
                  var40 = (float)(var13 & 16711680) - var34 * var7 + var34;
                  var41 = (float)(var13 & '\uff00') - var36 * var7 + var36;
                  var42 = (float)(var13 & 255) - var38 * var7 + var38;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var28 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var30 >= var29) && (var4 != var5 || var30 <= var28)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var28 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var30 >= var29) && (var4 != var6 || var28 <= var29)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)anInt1726) {
                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  if(var4 > (float)anInt1726) {
                     var4 = (float)anInt1726;
                  }

                  var11 = var11 - var32 * var8 + var32;
                  var40 = (float)(var14 & 16711680) - var34 * var8 + var34;
                  var41 = (float)(var14 & '\uff00') - var36 * var8 + var36;
                  var42 = (float)(var14 & 255) - var38 * var8 + var38;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var30 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var29 >= var28) && (var5 != var6 || var29 <= var30)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var30 * var4;
                        var4 = 0.0F;
                     }

                     if(var29 < var28) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var6 < (float)anInt1726) {
               if(var4 > (float)anInt1726) {
                  var4 = (float)anInt1726;
               }

               if(var5 > (float)anInt1726) {
                  var5 = (float)anInt1726;
               }

               var12 = var12 - var32 * var9 + var32;
               var40 = (float)(var15 & 16711680) - var34 * var9 + var34;
               var41 = (float)(var15 & '\uff00') - var36 * var9 + var36;
               var42 = (float)(var15 & 255) - var38 * var9 + var38;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var29 * var4;
                     var4 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var29 * var5;
                     var5 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  }
               }
            }
         }
      }
   }

   final void method3369(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29, int var30, float var31, int var32, int var33, float var34, int var35, int var36, float var37) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else {
         anInt1740 = var25;
         int var39;
         if(var4 > var5 || var4 > var6) {
            float var38;
            if(var5 <= var6) {
               var38 = var7;
               var7 = var8;
               var8 = var38;
               var38 = var4;
               var4 = var5;
               var5 = var38;
               var38 = var10;
               var10 = var11;
               var11 = var38;
               var38 = var16;
               var16 = var17;
               var17 = var38;
               var38 = var19;
               var19 = var20;
               var20 = var38;
               var38 = var13;
               var13 = var14;
               var14 = var38;
               var38 = var26;
               var26 = var27;
               var27 = var38;
               var38 = var31;
               var31 = var34;
               var34 = var38;
               var39 = var22;
               var22 = var23;
               var23 = var39;
               var39 = var30;
               var30 = var33;
               var33 = var39;
               var39 = var29;
               var29 = var32;
               var32 = var39;
            } else {
               var38 = var7;
               var7 = var9;
               var9 = var38;
               var38 = var4;
               var4 = var6;
               var6 = var38;
               var38 = var10;
               var10 = var12;
               var12 = var38;
               var38 = var16;
               var16 = var18;
               var18 = var38;
               var38 = var19;
               var19 = var21;
               var21 = var38;
               var38 = var13;
               var13 = var15;
               var15 = var38;
               var38 = var26;
               var26 = var28;
               var28 = var38;
               var38 = var31;
               var31 = var37;
               var37 = var38;
               var39 = var22;
               var22 = var24;
               var24 = var39;
               var39 = var30;
               var30 = var36;
               var36 = var39;
               var39 = var29;
               var29 = var35;
               var35 = var39;
            }
         }

         int var98 = (var29 & '\uffff') << 16 | var30 & '\uffff';
         var39 = (var32 & '\uffff') << 16 | var33 & '\uffff';
         int var40 = (var35 & '\uffff') << 16 | var36 & '\uffff';
         int var96;
         int var97;
         if(var98 != anInt1734) {
            anIntArray1725 = aClass103_Sub2_1743.method15389(var29, var30);
            if(anIntArray1725 == null) {
               anInt1734 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var29), 641433841) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1734 = var98;
            anInt1752 = aClass103_Sub2_1743.method15365(var29);
            anInt1744 = anInt1752 - 1;
            aClass529_1746 = aClass103_Sub2_1743.method15366(var29);
         }

         aFloat1745 = var31;
         if(var39 != anInt1749) {
            anIntArray1750 = aClass103_Sub2_1743.method15389(var32, var33);
            if(anIntArray1750 == null) {
               anInt1749 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var32), 1093846664) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1749 = var39;
            anInt1757 = aClass103_Sub2_1743.method15365(var32);
            anInt1742 = anInt1757 - 1;
         }

         aFloat1753 = var34;
         if(var40 != anInt1754) {
            anIntArray1755 = aClass103_Sub2_1743.method15389(var35, var36);
            if(anIntArray1755 == null) {
               anInt1754 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var35), 1112858046) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, (float)((int)var4), (float)((int)var5), (float)((int)var6), (float)((int)var7), (float)((int)var8), (float)((int)var9), (float)((int)var10), (float)((int)var11), (float)((int)var12), Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1754 = var40;
            anInt1738 = aClass103_Sub2_1743.method15365(var35);
            anInt1735 = anInt1738 - 1;
         }

         aFloat1758 = var37;
         var16 /= var13;
         var17 /= var14;
         var18 /= var15;
         var19 /= var13;
         var20 /= var14;
         var21 /= var15;
         var10 = 1.0F / var10;
         var11 = 1.0F / var11;
         var12 = 1.0F / var12;
         var13 = 1.0F / var13;
         var14 = 1.0F / var14;
         var15 = 1.0F / var15;
         float var41 = (float)(var22 >> 24 & 255);
         float var42 = (float)(var23 >> 24 & 255);
         float var43 = (float)(var24 >> 24 & 255);
         float var44 = (float)(var22 >> 16 & 255);
         float var45 = (float)(var23 >> 16 & 255);
         float var46 = (float)(var24 >> 16 & 255);
         float var47 = (float)(var22 >> 8 & 255);
         float var48 = (float)(var23 >> 8 & 255);
         float var49 = (float)(var24 >> 8 & 255);
         float var50 = (float)(var22 & 255);
         float var51 = (float)(var23 & 255);
         float var52 = (float)(var24 & 255);
         float var53 = 1.0F;
         float var54 = 0.0F;
         float var55 = 0.0F;
         float var56 = 0.0F;
         float var57 = 1.0F;
         float var58 = 0.0F;
         float var59 = 0.0F;
         float var60 = 0.0F;
         float var61 = 0.0F;
         float var62 = 0.0F;
         float var63 = 0.0F;
         float var64 = 0.0F;
         float var65 = 0.0F;
         float var66 = 0.0F;
         float var67 = 0.0F;
         float var68 = 0.0F;
         float var69 = 0.0F;
         float var70 = 0.0F;
         float var71;
         if(var5 != var4) {
            var71 = var5 - var4;
            var59 = (var8 - var7) / var71;
            var60 = (var11 - var10) / var71;
            var61 = (var14 - var13) / var71;
            var62 = (var17 - var16) / var71;
            var63 = (var20 - var19) / var71;
            var64 = (var27 - var26) / var71;
            var65 = (var42 - var41) / var71;
            var66 = (var45 - var44) / var71;
            var67 = (var48 - var47) / var71;
            var68 = (var51 - var50) / var71;
            var69 = (var54 - var53) / var71;
            var70 = (var57 - var56) / var71;
         }

         var71 = 0.0F;
         float var72 = 0.0F;
         float var73 = 0.0F;
         float var74 = 0.0F;
         float var75 = 0.0F;
         float var76 = 0.0F;
         float var77 = 0.0F;
         float var78 = 0.0F;
         float var79 = 0.0F;
         float var80 = 0.0F;
         float var81 = 0.0F;
         float var82 = 0.0F;
         float var83;
         if(var6 != var5) {
            var83 = var6 - var5;
            var71 = (var9 - var8) / var83;
            var72 = (var12 - var11) / var83;
            var73 = (var15 - var14) / var83;
            var74 = (var18 - var17) / var83;
            var75 = (var21 - var20) / var83;
            var76 = (var28 - var27) / var83;
            var77 = (var43 - var42) / var83;
            var78 = (var46 - var45) / var83;
            var79 = (var49 - var48) / var83;
            var80 = (var52 - var51) / var83;
            var81 = (var55 - var54) / var83;
            var82 = (var58 - var57) / var83;
         }

         var83 = 0.0F;
         float var84 = 0.0F;
         float var85 = 0.0F;
         float var86 = 0.0F;
         float var87 = 0.0F;
         float var88 = 0.0F;
         float var89 = 0.0F;
         float var90 = 0.0F;
         float var91 = 0.0F;
         float var92 = 0.0F;
         float var93 = 0.0F;
         float var94 = 0.0F;
         if(var4 != var6) {
            float var95 = var4 - var6;
            var83 = (var7 - var9) / var95;
            var84 = (var10 - var12) / var95;
            var85 = (var13 - var15) / var95;
            var86 = (var16 - var18) / var95;
            var87 = (var19 - var21) / var95;
            var88 = (var26 - var28) / var95;
            var89 = (var41 - var43) / var95;
            var90 = (var44 - var46) / var95;
            var91 = (var47 - var49) / var95;
            var92 = (var50 - var52) / var95;
            var93 = (var53 - var55) / var95;
            var94 = (var56 - var58) / var95;
         }

         if(var4 < (float)anInt1726) {
            if(var5 > (float)anInt1726) {
               var5 = (float)anInt1726;
            }

            if(var6 > (float)anInt1726) {
               var6 = (float)anInt1726;
            }

            if(var5 < var6) {
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var21 = var19;
               var28 = var26;
               var43 = var41;
               var46 = var44;
               var49 = var47;
               var52 = var50;
               var55 = var53;
               var58 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var9 -= var83 * var4;
                  var10 -= var60 * var4;
                  var12 -= var84 * var4;
                  var13 -= var61 * var4;
                  var15 -= var85 * var4;
                  var16 -= var62 * var4;
                  var18 -= var86 * var4;
                  var19 -= var63 * var4;
                  var21 -= var87 * var4;
                  var26 -= var64 * var4;
                  var28 -= var88 * var4;
                  var41 -= var65 * var4;
                  var43 -= var89 * var4;
                  var44 -= var66 * var4;
                  var46 -= var90 * var4;
                  var47 -= var67 * var4;
                  var49 -= var91 * var4;
                  var50 -= var68 * var4;
                  var52 -= var92 * var4;
                  var53 -= var69 * var4;
                  var55 -= var93 * var4;
                  var56 -= var70 * var4;
                  var58 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var5 < 0.0F) {
                  var8 -= var71 * var5;
                  var11 -= var72 * var5;
                  var14 -= var73 * var5;
                  var17 -= var74 * var5;
                  var20 -= var75 * var5;
                  var27 -= var76 * var5;
                  var42 -= var77 * var5;
                  var45 -= var78 * var5;
                  var48 -= var79 * var5;
                  var51 -= var80 * var5;
                  var54 -= var81 * var5;
                  var57 -= var82 * var5;
                  var5 = 0.0F;
               }

               if((var4 == var5 || var83 >= var59) && (var4 != var5 || var83 <= var71)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var8, (int)var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var42, var43, var45, var46, var48, var49, var51, var52, var54, var55, var57, var58);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var43, var42, var46, var45, var49, var48, var52, var51, var55, var54, var58, var57);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)anInt1737;
                  }
               }
            } else {
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var20 = var19;
               var27 = var26;
               var42 = var41;
               var45 = var44;
               var48 = var47;
               var51 = var50;
               var54 = var53;
               var57 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var8 -= var83 * var4;
                  var10 -= var60 * var4;
                  var11 -= var84 * var4;
                  var13 -= var61 * var4;
                  var14 -= var85 * var4;
                  var16 -= var62 * var4;
                  var17 -= var86 * var4;
                  var19 -= var63 * var4;
                  var20 -= var87 * var4;
                  var26 -= var64 * var4;
                  var27 -= var88 * var4;
                  var41 -= var65 * var4;
                  var42 -= var89 * var4;
                  var44 -= var66 * var4;
                  var45 -= var90 * var4;
                  var47 -= var67 * var4;
                  var48 -= var91 * var4;
                  var50 -= var68 * var4;
                  var51 -= var92 * var4;
                  var53 -= var69 * var4;
                  var54 -= var93 * var4;
                  var56 -= var70 * var4;
                  var57 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var6 < 0.0F) {
                  var9 -= var71 * var6;
                  var12 -= var72 * var6;
                  var15 -= var73 * var6;
                  var18 -= var74 * var6;
                  var21 -= var75 * var6;
                  var28 -= var76 * var6;
                  var43 -= var77 * var6;
                  var46 -= var78 * var6;
                  var49 -= var79 * var6;
                  var52 -= var80 * var6;
                  var55 -= var81 * var6;
                  var58 -= var82 * var6;
                  var6 = 0.0F;
               }

               if((var4 == var6 || var83 >= var59) && (var4 != var6 || var71 <= var59)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var41, var42, var44, var45, var47, var48, var50, var51, var53, var54, var56, var57);
                     var8 += var83;
                     var7 += var59;
                     var11 += var84;
                     var10 += var60;
                     var14 += var85;
                     var13 += var61;
                     var17 += var86;
                     var16 += var62;
                     var20 += var87;
                     var19 += var63;
                     var27 += var88;
                     var26 += var64;
                     var42 += var89;
                     var41 += var65;
                     var45 += var90;
                     var44 += var66;
                     var48 += var91;
                     var47 += var67;
                     var51 += var92;
                     var50 += var68;
                     var54 += var93;
                     var53 += var69;
                     var57 += var94;
                     var56 += var70;
                  }

                  while(--var5 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var71;
                     var10 += var60;
                     var12 += var72;
                     var13 += var61;
                     var15 += var73;
                     var16 += var62;
                     var18 += var74;
                     var19 += var63;
                     var21 += var75;
                     var26 += var64;
                     var28 += var76;
                     var41 += var65;
                     var43 += var77;
                     var44 += var66;
                     var46 += var78;
                     var47 += var67;
                     var49 += var79;
                     var50 += var68;
                     var52 += var80;
                     var53 += var69;
                     var55 += var81;
                     var56 += var70;
                     var58 += var82;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var8, (int)var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var42, var41, var45, var44, var48, var47, var51, var50, var54, var53, var57, var56);
                     var7 += var59;
                     var8 += var83;
                     var10 += var60;
                     var11 += var84;
                     var13 += var61;
                     var14 += var85;
                     var16 += var62;
                     var17 += var86;
                     var19 += var63;
                     var20 += var87;
                     var26 += var64;
                     var27 += var88;
                     var41 += var65;
                     var42 += var89;
                     var44 += var66;
                     var45 += var90;
                     var47 += var67;
                     var48 += var91;
                     var50 += var68;
                     var51 += var92;
                     var53 += var69;
                     var54 += var93;
                     var56 += var70;
                     var57 += var94;
                  }

                  while(--var5 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var9 += var71;
                     var7 += var59;
                     var12 += var72;
                     var10 += var60;
                     var15 += var73;
                     var13 += var61;
                     var18 += var74;
                     var16 += var62;
                     var21 += var75;
                     var19 += var63;
                     var28 += var76;
                     var26 += var64;
                     var43 += var77;
                     var41 += var65;
                     var46 += var78;
                     var44 += var66;
                     var49 += var79;
                     var47 += var67;
                     var52 += var80;
                     var50 += var68;
                     var55 += var81;
                     var53 += var69;
                     var58 += var82;
                     var56 += var70;
                     var4 += (float)anInt1737;
                  }
               }
            }

         }
      }
   }

   final void method3370(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      if(aBool1748) {
         if(var8 > anInt1733) {
            var8 = anInt1733;
         }

         if(var7 < 0) {
            var7 = 0;
         }
      }

      if(var7 < var8) {
         int var17;
         int var19;
         int var18;
         int var21;
         int var20;
         int var22;
         if(aBool1756) {
            var4 += var7;
            var11 += var12 * (float)var7;
            var13 += var14 * (float)var7;
            var15 += var16 * (float)var7;
            if(aBool1721) {
               var6 = var8 - var7 >> 2;
               var12 *= 4.0F;
               var14 *= 4.0F;
               var16 *= 4.0F;
               if(anInt1723 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        var3[var4++] = var5;
                        --var6;
                     } while(var6 > 0);
                  }
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }

                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                     do {
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }

                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  if(var6 > 0) {
                     do {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var18 = var4++;
                        var20 = var3[var18];
                        var21 = var5 + var20;
                        var22 = (var5 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        var21 = var4++;
                        int var23 = var3[var21];
                        int var24 = var5 + var23;
                        int var25 = (var5 & 16711935) + (var23 & 16711935);
                        var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                        var3[var21] = -16777216 | var24 - var23 | var23 - (var23 >>> 8);
                        var24 = var4++;
                        int var26 = var3[var24];
                        int var27 = var5 + var26;
                        int var28 = (var5 & 16711935) + (var26 & 16711935);
                        var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                        var3[var24] = -16777216 | var27 - var26 | var26 - (var26 >>> 8);
                        var27 = var4++;
                        int var29 = var3[var27];
                        int var30 = var5 + var29;
                        int var31 = (var5 & 16711935) + (var29 & 16711935);
                        var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                        var3[var27] = -16777216 | var30 - var29 | var29 - (var29 >>> 8);
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        var18 = var4++;
                        var20 = var3[var18];
                        var21 = var5 + var20;
                        var22 = (var5 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        --var6;
                     } while(var6 > 0);
                  }
               }
            } else {
               var6 = var8 - var7;
               if(anInt1723 == 0) {
                  do {
                     var3[var4++] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;

                  do {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                     var19 = var3[var4];
                     if(var2) {
                        var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                     } else {
                        var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                     }

                     --var6;
                  } while(var6 > 0);
               } else {
                  do {
                     var18 = var4++;
                     var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var20 = var3[var18];
                     var21 = var19 + var20;
                     var22 = (var19 & 16711935) + (var20 & 16711935);
                     var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                     var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               }
            }

         } else {
            var4 += var7 - 1;
            var9 += var10 * (float)var7;
            var11 += var12 * (float)var7;
            var13 += var14 * (float)var7;
            var15 += var16 * (float)var7;
            if(aClass189_1736.aBool2220) {
               if(aBool1721) {
                  var6 = var8 - var7 >> 2;
                  var12 *= 4.0F;
                  var14 *= 4.0F;
                  var16 *= 4.0F;
                  if(anInt1723 == 0) {
                     if(var6 > 0) {
                        do {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                        do {
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  } else if(!aBool1722) {
                     var17 = anInt1723;
                     var18 = 256 - anInt1723;
                     if(var6 > 0) {
                        do {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                        do {
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  } else {
                     if(var6 > 0) {
                        do {
                           var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                        do {
                           ++var4;
                           if(!var1 || var9 < aFloatArray1739[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 aFloatArray1739[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  }

               } else {
                  var6 = var8 - var7;
                  if(anInt1723 == 0) {
                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           if(var1) {
                              aFloatArray1739[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  } else if(!aBool1722) {
                     var17 = anInt1723;
                     var18 = 256 - anInt1723;

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }

                           if(var1) {
                              aFloatArray1739[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  } else {
                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var20 = var3[var4];
                           var21 = var19 + var20;
                           var22 = (var19 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                           if(var1) {
                              aFloatArray1739[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  }

               }
            } else if(aBool1721) {
               var6 = var8 - var7 >> 2;
               var12 *= 4.0F;
               var14 *= 4.0F;
               var16 *= 4.0F;
               if(anInt1723 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  if(var6 > 0) {
                     do {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        ++var4;
                        if(!var1 || var9 < aFloatArray1739[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               }

            } else {
               var6 = var8 - var7;
               if(anInt1723 == 0) {
                  do {
                     ++var4;
                     if(!var1 || var9 < aFloatArray1739[var4]) {
                        var3[var4] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else if(!aBool1722) {
                  var17 = anInt1723;
                  var18 = 256 - anInt1723;

                  do {
                     ++var4;
                     if(!var1 || var9 < aFloatArray1739[var4]) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else {
                  do {
                     ++var4;
                     if(!var1 || var9 < aFloatArray1739[var4]) {
                        var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var20 = var3[var4];
                        var21 = var19 + var20;
                        var22 = (var19 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               }

            }
         }
      }
   }

   int method3371() {
      return anIntArray1730[0] / anInt1737;
   }

   final void method3372(boolean var1, boolean var2, boolean var3, int[] var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11) {
      if(aBool1748) {
         if(var9 > anInt1733) {
            var9 = anInt1733;
         }

         if(var8 < 0) {
            var8 = 0;
         }
      }

      if(var8 < var9) {
         var5 += var8 - 1;
         var7 = var9 - var8 >> 2;
         var10 += var11 * (float)var8;
         int var12;
         int var13;
         int var14;
         if(aClass189_1736.aBool2220) {
            if(anInt1723 == 0) {
               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           if(var1) {
                              var4[var5] = var6;
                           }

                           if(var2) {
                              aFloatArray1739[var5] = var10;
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
               }
            } else if(anInt1723 == 254) {
               if(var8 != 0 && var9 <= anInt1733 - 1) {
                  while(true) {
                     --var7;
                     if(var7 < 0) {
                        var7 = var9 - var8 & 3;

                        while(true) {
                           --var7;
                           if(var7 < 0) {
                              return;
                           }

                           ++var5;
                           if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                              var4[var5 - 1] = var4[var5];
                           }

                           var10 += var11;
                        }
                     }

                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                  }
               }
            } else {
               var12 = anInt1723;
               var13 = 256 - anInt1723;
               var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           if(var1) {
                              var14 = var4[var5];
                              if(var3) {
                                 var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                              } else {
                                 var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                              }
                           }

                           if(var2) {
                              aFloatArray1739[var5] = var10;
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
               }
            }
         } else if(var1) {
            if(anInt1723 == 0) {
               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           var4[var5] = var6;
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
               }
            } else if(anInt1723 == 254) {
               if(var8 != 0 && var9 <= anInt1733 - 1) {
                  while(true) {
                     --var7;
                     if(var7 < 0) {
                        var7 = var9 - var8 & 3;

                        while(true) {
                           --var7;
                           if(var7 < 0) {
                              return;
                           }

                           ++var5;
                           if(!var2 || var10 < aFloatArray1739[var5]) {
                              var4[var5 - 1] = var4[var5];
                           }

                           var10 += var11;
                        }
                     }

                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                  }
               }
            } else {
               var12 = anInt1723;
               var13 = 256 - anInt1723;
               var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           var14 = var4[var5];
                           if(var3) {
                              var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                           } else {
                              var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
               }
            }
         }
      }
   }

   final void method3373(boolean var1, boolean var2, boolean var3, int[] var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11) {
      if(aBool1748) {
         if(var9 > anInt1733) {
            var9 = anInt1733;
         }

         if(var8 < 0) {
            var8 = 0;
         }
      }

      if(var8 < var9) {
         var5 += var8 - 1;
         var7 = var9 - var8 >> 2;
         var10 += var11 * (float)var8;
         int var12;
         int var13;
         int var14;
         if(aClass189_1736.aBool2220) {
            if(anInt1723 == 0) {
               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           if(var1) {
                              var4[var5] = var6;
                           }

                           if(var2) {
                              aFloatArray1739[var5] = var10;
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
               }
            } else if(anInt1723 == 254) {
               if(var8 != 0 && var9 <= anInt1733 - 1) {
                  while(true) {
                     --var7;
                     if(var7 < 0) {
                        var7 = var9 - var8 & 3;

                        while(true) {
                           --var7;
                           if(var7 < 0) {
                              return;
                           }

                           ++var5;
                           if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                              var4[var5 - 1] = var4[var5];
                           }

                           var10 += var11;
                        }
                     }

                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                  }
               }
            } else {
               var12 = anInt1723;
               var13 = 256 - anInt1723;
               var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           if(var1) {
                              var14 = var4[var5];
                              if(var3) {
                                 var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                              } else {
                                 var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                              }
                           }

                           if(var2) {
                              aFloatArray1739[var5] = var10;
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
               }
            }
         } else if(var1) {
            if(anInt1723 == 0) {
               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           var4[var5] = var6;
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
               }
            } else if(anInt1723 == 254) {
               if(var8 != 0 && var9 <= anInt1733 - 1) {
                  while(true) {
                     --var7;
                     if(var7 < 0) {
                        var7 = var9 - var8 & 3;

                        while(true) {
                           --var7;
                           if(var7 < 0) {
                              return;
                           }

                           ++var5;
                           if(!var2 || var10 < aFloatArray1739[var5]) {
                              var4[var5 - 1] = var4[var5];
                           }

                           var10 += var11;
                        }
                     }

                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                  }
               }
            } else {
               var12 = anInt1723;
               var13 = 256 - anInt1723;
               var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           var14 = var4[var5];
                           if(var3) {
                              var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                           } else {
                              var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
               }
            }
         }
      }
   }

   final void method3374(boolean var1, boolean var2, boolean var3, int[] var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11) {
      if(aBool1748) {
         if(var9 > anInt1733) {
            var9 = anInt1733;
         }

         if(var8 < 0) {
            var8 = 0;
         }
      }

      if(var8 < var9) {
         var5 += var8 - 1;
         var7 = var9 - var8 >> 2;
         var10 += var11 * (float)var8;
         int var12;
         int var13;
         int var14;
         if(aClass189_1736.aBool2220) {
            if(anInt1723 == 0) {
               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           if(var1) {
                              var4[var5] = var6;
                           }

                           if(var2) {
                              aFloatArray1739[var5] = var10;
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
               }
            } else if(anInt1723 == 254) {
               if(var8 != 0 && var9 <= anInt1733 - 1) {
                  while(true) {
                     --var7;
                     if(var7 < 0) {
                        var7 = var9 - var8 & 3;

                        while(true) {
                           --var7;
                           if(var7 < 0) {
                              return;
                           }

                           ++var5;
                           if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                              var4[var5 - 1] = var4[var5];
                           }

                           var10 += var11;
                        }
                     }

                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < aFloatArray1739[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                  }
               }
            } else {
               var12 = anInt1723;
               var13 = 256 - anInt1723;
               var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           if(var1) {
                              var14 = var4[var5];
                              if(var3) {
                                 var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                              } else {
                                 var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                              }
                           }

                           if(var2) {
                              aFloatArray1739[var5] = var10;
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        aFloatArray1739[var5] = var10;
                     }
                  }

                  var10 += var11;
               }
            }
         } else if(var1) {
            if(anInt1723 == 0) {
               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           var4[var5] = var6;
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
               }
            } else if(anInt1723 == 254) {
               if(var8 != 0 && var9 <= anInt1733 - 1) {
                  while(true) {
                     --var7;
                     if(var7 < 0) {
                        var7 = var9 - var8 & 3;

                        while(true) {
                           --var7;
                           if(var7 < 0) {
                              return;
                           }

                           ++var5;
                           if(!var2 || var10 < aFloatArray1739[var5]) {
                              var4[var5 - 1] = var4[var5];
                           }

                           var10 += var11;
                        }
                     }

                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < aFloatArray1739[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                  }
               }
            } else {
               var12 = anInt1723;
               var13 = 256 - anInt1723;
               var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < aFloatArray1739[var5]) {
                           var14 = var4[var5];
                           if(var3) {
                              var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                           } else {
                              var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < aFloatArray1739[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
               }
            }
         }
      }
   }

   final void method3375(boolean var1, boolean var2, int[] var3, int[] var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25) {
      int var26 = var7 - var6;
      float var27 = 1.0F / (float)var26;
      float var28 = (var9 - var8) * var27;
      float var29 = (var11 - var10) * var27;
      float var30 = (var13 - var12) * var27;
      float var31 = (var15 - var14) * var27;
      float var32 = (var17 - var16) * var27;
      float var33 = (var19 - var18) * var27;
      float var34 = (var21 - var20) * var27;
      float var35 = (var23 - var22) * var27;
      float var36 = (var25 - var24) * var27;
      if(aBool1748) {
         if(var7 > anInt1733) {
            var7 = anInt1733;
         }

         if(var6 < 0) {
            var8 -= var28 * (float)var6;
            var10 -= var29 * (float)var6;
            var12 -= var30 * (float)var6;
            var14 -= var31 * (float)var6;
            var16 -= var32 * (float)var6;
            var18 -= var33 * (float)var6;
            var20 -= var34 * (float)var6;
            var22 -= var35 * (float)var6;
            var24 -= var36 * (float)var6;
            var6 = 0;
         }
      }

      if(var6 < var7) {
         var26 = var7 - var6;

         for(var5 += var6; var26-- > 0; var24 += var36) {
            float var37 = 1.0F / var8;
            float var38 = 1.0F / var10;
            if(!var1 || var37 < aFloatArray1739[var5]) {
               int var39 = (int)(var12 * var38 * (float)anInt1752);
               if(aBool1741) {
                  var39 &= anInt1744;
               } else if(var39 < 0) {
                  var39 = 0;
               } else if(var39 > anInt1744) {
                  var39 = anInt1744;
               }

               int var40 = (int)(var14 * var38 * (float)anInt1752);
               if(aBool1741) {
                  var40 &= anInt1744;
               } else if(var40 < 0) {
                  var40 = 0;
               } else if(var40 > anInt1744) {
                  var40 = anInt1744;
               }

               int var41 = anIntArray1725[var40 * anInt1752 + var39];
               //boolean var42 = true;
               int var46;
               if(aClass529_1746 == Class529.aClass529_6944) {
                  var46 = (int)((float)(var41 >> 24 & 255) * var18 / 255.0F);
               } else if(aClass529_1746 == Class529.aClass529_6943) {
                  if((var41 >> 24 & 255) > anInt1747) {
                     var46 = 255;
                  } else {
                     var46 = 0;
                  }
               } else {
                  var46 = (int)var18;
               }

               if(var46 != 0) {
                  int var43;
                  int var44;
                  int var45;
                  if(var46 != 255) {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((anInt1740 & 16711935) * (int)var16 & -16711936 | (anInt1740 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     var44 = var3[var5];
                     var45 = 255 - var46;
                     var43 = ((var44 & 16711935) * var45 + (var43 & 16711935) * var46 & -16711936) + ((var44 & '\uff00') * var45 + (var43 & '\uff00') * var46 & 16711680) >> 8;
                     if(var2) {
                        var3[var5] = (var46 | var3[var5] >> 24) << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        aFloatArray1739[var5] = var37;
                     }
                  } else {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((anInt1740 & 16711935) * (int)var16 & -16711936 | (anInt1740 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     if(var2) {
                        var3[var5] = var46 << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        aFloatArray1739[var5] = var37;
                     }
                  }
               }
            }

            ++var5;
            var8 += var28;
            var10 += var29;
            var12 += var30;
            var14 += var31;
            var16 += var32;
            var18 += var33;
            var20 += var34;
            var22 += var35;
         }

      }
   }

   final void method3376(boolean var1, boolean var2, int[] var3, int[] var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25) {
      int var26 = var7 - var6;
      float var27 = 1.0F / (float)var26;
      float var28 = (var9 - var8) * var27;
      float var29 = (var11 - var10) * var27;
      float var30 = (var13 - var12) * var27;
      float var31 = (var15 - var14) * var27;
      float var32 = (var17 - var16) * var27;
      float var33 = (var19 - var18) * var27;
      float var34 = (var21 - var20) * var27;
      float var35 = (var23 - var22) * var27;
      float var36 = (var25 - var24) * var27;
      if(aBool1748) {
         if(var7 > anInt1733) {
            var7 = anInt1733;
         }

         if(var6 < 0) {
            var8 -= var28 * (float)var6;
            var10 -= var29 * (float)var6;
            var12 -= var30 * (float)var6;
            var14 -= var31 * (float)var6;
            var16 -= var32 * (float)var6;
            var18 -= var33 * (float)var6;
            var20 -= var34 * (float)var6;
            var22 -= var35 * (float)var6;
            var24 -= var36 * (float)var6;
            var6 = 0;
         }
      }

      if(var6 < var7) {
         var26 = var7 - var6;

         for(var5 += var6; var26-- > 0; var24 += var36) {
            float var37 = 1.0F / var8;
            float var38 = 1.0F / var10;
            if(!var1 || var37 < aFloatArray1739[var5]) {
               int var39 = (int)(var12 * var38 * (float)anInt1752);
               if(aBool1741) {
                  var39 &= anInt1744;
               } else if(var39 < 0) {
                  var39 = 0;
               } else if(var39 > anInt1744) {
                  var39 = anInt1744;
               }

               int var40 = (int)(var14 * var38 * (float)anInt1752);
               if(aBool1741) {
                  var40 &= anInt1744;
               } else if(var40 < 0) {
                  var40 = 0;
               } else if(var40 > anInt1744) {
                  var40 = anInt1744;
               }

               int var41 = anIntArray1725[var40 * anInt1752 + var39];
               //boolean var42 = true;
               int var46;
               if(aClass529_1746 == Class529.aClass529_6944) {
                  var46 = (int)((float)(var41 >> 24 & 255) * var18 / 255.0F);
               } else if(aClass529_1746 == Class529.aClass529_6943) {
                  if((var41 >> 24 & 255) > anInt1747) {
                     var46 = 255;
                  } else {
                     var46 = 0;
                  }
               } else {
                  var46 = (int)var18;
               }

               if(var46 != 0) {
                  int var43;
                  int var44;
                  int var45;
                  if(var46 != 255) {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((anInt1740 & 16711935) * (int)var16 & -16711936 | (anInt1740 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     var44 = var3[var5];
                     var45 = 255 - var46;
                     var43 = ((var44 & 16711935) * var45 + (var43 & 16711935) * var46 & -16711936) + ((var44 & '\uff00') * var45 + (var43 & '\uff00') * var46 & 16711680) >> 8;
                     if(var2) {
                        var3[var5] = (var46 | var3[var5] >> 24) << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        aFloatArray1739[var5] = var37;
                     }
                  } else {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((anInt1740 & 16711935) * (int)var16 & -16711936 | (anInt1740 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     if(var2) {
                        var3[var5] = var46 << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        aFloatArray1739[var5] = var37;
                     }
                  }
               }
            }

            ++var5;
            var8 += var28;
            var10 += var29;
            var12 += var30;
            var14 += var31;
            var16 += var32;
            var18 += var33;
            var20 += var34;
            var22 += var35;
         }

      }
   }

   final void method3377(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13) {
      if(aBool1724) {
         aClass103_Sub2_1743.method2517((int)var7, (int)var4, (int)var8, (int)var5, var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var8, (int)var5, (int)var9, (int)var6, var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var9, (int)var6, (int)var7, (int)var4, var13, 223909001);
      } else {
         float var14 = var8 - var7;
         float var15 = var5 - var4;
         float var16 = var9 - var7;
         float var17 = var6 - var4;
         float var18 = var11 - var10;
         float var19 = var12 - var10;
         float var20 = 0.0F;
         if(var5 != var4) {
            var20 = (var8 - var7) / (var5 - var4);
         }

         float var21 = 0.0F;
         if(var6 != var5) {
            var21 = (var9 - var8) / (var6 - var5);
         }

         float var22 = 0.0F;
         if(var6 != var4) {
            var22 = (var7 - var9) / (var4 - var6);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)anInt1726) {
                  if(var5 > (float)anInt1726) {
                     var5 = (float)anInt1726;
                  }

                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  var10 = var10 - var24 * var7 + var24;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var22 * var4;
                        var7 -= var20 * var4;
                        var10 -= var25 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var21 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var22 >= var20) && (var4 != var5 || var22 <= var21)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var7, (int)var9, var10, var24);
                           var9 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var8, (int)var9, var10, var24);
                           var9 += var22;
                           var8 += var21;
                           var10 += var25;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var9, (int)var7, var10, var24);
                           var9 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var9, (int)var8, var10, var24);
                           var9 += var22;
                           var8 += var21;
                           var10 += var25;
                           var4 += (float)anInt1737;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var22 * var4;
                        var7 -= var20 * var4;
                        var10 -= var25 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var21 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var22 >= var20) && (var4 != var6 || var21 <= var20)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var7, (int)var8, var10, var24);
                           var8 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var5 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var7, (int)var9, var10, var24);
                           var9 += var21;
                           var7 += var20;
                           var10 += var25;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var8, (int)var7, var10, var24);
                           var8 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var5 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var4, var13, 0, (int)var9, (int)var7, var10, var24);
                           var9 += var21;
                           var7 += var20;
                           var10 += var25;
                           var4 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)anInt1726) {
                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  if(var4 > (float)anInt1726) {
                     var4 = (float)anInt1726;
                  }

                  var11 = var11 - var24 * var8 + var24;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var20 * var5;
                        var8 -= var21 * var5;
                        var11 -= var25 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var22 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var20 >= var21) && (var5 != var6 || var20 <= var22)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var8, (int)var7, var11, var24);
                           var7 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var4 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var9, (int)var7, var11, var24);
                           var7 += var20;
                           var9 += var22;
                           var11 += var25;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var7, (int)var8, var11, var24);
                           var7 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var4 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var7, (int)var9, var11, var24);
                           var7 += var20;
                           var9 += var22;
                           var11 += var25;
                           var5 += (float)anInt1737;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var20 * var5;
                        var8 -= var21 * var5;
                        var11 -= var25 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var22 * var4;
                        var4 = 0.0F;
                     }

                     if(var20 < var21) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var9, (int)var8, var11, var24);
                           var9 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var7, (int)var8, var11, var24);
                           var7 += var22;
                           var8 += var21;
                           var11 += var25;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var8, (int)var9, var11, var24);
                           var9 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           method3374(var1, var2, var3, anIntArray1751, (int)var5, var13, 0, (int)var8, (int)var7, var11, var24);
                           var7 += var22;
                           var8 += var21;
                           var11 += var25;
                           var5 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var6 < (float)anInt1726) {
               if(var4 > (float)anInt1726) {
                  var4 = (float)anInt1726;
               }

               if(var5 > (float)anInt1726) {
                  var5 = (float)anInt1726;
               }

               var12 = var12 - var24 * var9 + var24;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var21 * var6;
                     var9 -= var22 * var6;
                     var12 -= var25 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var20 * var4;
                     var4 = 0.0F;
                  }

                  if(var21 < var22) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var8, (int)var9, var12, var24);
                        var8 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var5 >= 0.0F) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var8, (int)var7, var12, var24);
                        var8 += var21;
                        var7 += var20;
                        var12 += var25;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var9, (int)var8, var12, var24);
                        var8 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var5 >= 0.0F) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var7, (int)var8, var12, var24);
                        var8 += var21;
                        var7 += var20;
                        var12 += var25;
                        var6 += (float)anInt1737;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var21 * var6;
                     var9 -= var22 * var6;
                     var12 -= var25 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var20 * var5;
                     var5 = 0.0F;
                  }

                  if(var21 < var22) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var7, (int)var9, var12, var24);
                        var7 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var4 >= 0.0F) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var8, (int)var9, var12, var24);
                        var8 += var20;
                        var9 += var22;
                        var12 += var25;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var9, (int)var7, var12, var24);
                        var7 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var4 >= 0.0F) {
                        method3374(var1, var2, var3, anIntArray1751, (int)var6, var13, 0, (int)var9, (int)var8, var12, var24);
                        var8 += var20;
                        var9 += var22;
                        var12 += var25;
                        var6 += (float)anInt1737;
                     }

                  }
               }
            }
         }
      }
   }

   final void method3378(boolean var1, boolean var2, int[] var3, int[] var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25) {
      int var26 = var7 - var6;
      float var27 = 1.0F / (float)var26;
      float var28 = (var9 - var8) * var27;
      float var29 = (var11 - var10) * var27;
      float var30 = (var13 - var12) * var27;
      float var31 = (var15 - var14) * var27;
      float var32 = (var17 - var16) * var27;
      float var33 = (var19 - var18) * var27;
      float var34 = (var21 - var20) * var27;
      float var35 = (var23 - var22) * var27;
      float var36 = (var25 - var24) * var27;
      if(aBool1748) {
         if(var7 > anInt1733) {
            var7 = anInt1733;
         }

         if(var6 < 0) {
            var8 -= var28 * (float)var6;
            var10 -= var29 * (float)var6;
            var12 -= var30 * (float)var6;
            var14 -= var31 * (float)var6;
            var16 -= var32 * (float)var6;
            var18 -= var33 * (float)var6;
            var20 -= var34 * (float)var6;
            var22 -= var35 * (float)var6;
            var24 -= var36 * (float)var6;
            var6 = 0;
         }
      }

      if(var6 < var7) {
         var26 = var7 - var6;

         for(var5 += var6; var26-- > 0; var24 += var36) {
            float var37 = 1.0F / var8;
            float var38 = 1.0F / var10;
            if(!var1 || var37 < aFloatArray1739[var5]) {
               int var39 = (int)(var12 * var38 * (float)anInt1752);
               if(aBool1741) {
                  var39 &= anInt1744;
               } else if(var39 < 0) {
                  var39 = 0;
               } else if(var39 > anInt1744) {
                  var39 = anInt1744;
               }

               int var40 = (int)(var14 * var38 * (float)anInt1752);
               if(aBool1741) {
                  var40 &= anInt1744;
               } else if(var40 < 0) {
                  var40 = 0;
               } else if(var40 > anInt1744) {
                  var40 = anInt1744;
               }

               int var41 = anIntArray1725[var40 * anInt1752 + var39];
               //boolean var42 = true;
               int var46;
               if(aClass529_1746 == Class529.aClass529_6944) {
                  var46 = (int)((float)(var41 >> 24 & 255) * var18 / 255.0F);
               } else if(aClass529_1746 == Class529.aClass529_6943) {
                  if((var41 >> 24 & 255) > anInt1747) {
                     var46 = 255;
                  } else {
                     var46 = 0;
                  }
               } else {
                  var46 = (int)var18;
               }

               if(var46 != 0) {
                  int var43;
                  int var44;
                  int var45;
                  if(var46 != 255) {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((anInt1740 & 16711935) * (int)var16 & -16711936 | (anInt1740 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     var44 = var3[var5];
                     var45 = 255 - var46;
                     var43 = ((var44 & 16711935) * var45 + (var43 & 16711935) * var46 & -16711936) + ((var44 & '\uff00') * var45 + (var43 & '\uff00') * var46 & 16711680) >> 8;
                     if(var2) {
                        var3[var5] = (var46 | var3[var5] >> 24) << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        aFloatArray1739[var5] = var37;
                     }
                  } else {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((anInt1740 & 16711935) * (int)var16 & -16711936 | (anInt1740 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     if(var2) {
                        var3[var5] = var46 << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        aFloatArray1739[var5] = var37;
                     }
                  }
               }
            }

            ++var5;
            var8 += var28;
            var10 += var29;
            var12 += var30;
            var14 += var31;
            var16 += var32;
            var18 += var33;
            var20 += var34;
            var22 += var35;
         }

      }
   }

   final void method3379(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29, int var30, float var31, int var32, int var33, float var34, int var35, int var36, float var37) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else {
         anInt1740 = var25;
         int var39;
         if(var4 > var5 || var4 > var6) {
            float var38;
            if(var5 <= var6) {
               var38 = var7;
               var7 = var8;
               var8 = var38;
               var38 = var4;
               var4 = var5;
               var5 = var38;
               var38 = var10;
               var10 = var11;
               var11 = var38;
               var38 = var16;
               var16 = var17;
               var17 = var38;
               var38 = var19;
               var19 = var20;
               var20 = var38;
               var38 = var13;
               var13 = var14;
               var14 = var38;
               var38 = var26;
               var26 = var27;
               var27 = var38;
               var38 = var31;
               var31 = var34;
               var34 = var38;
               var39 = var22;
               var22 = var23;
               var23 = var39;
               var39 = var30;
               var30 = var33;
               var33 = var39;
               var39 = var29;
               var29 = var32;
               var32 = var39;
            } else {
               var38 = var7;
               var7 = var9;
               var9 = var38;
               var38 = var4;
               var4 = var6;
               var6 = var38;
               var38 = var10;
               var10 = var12;
               var12 = var38;
               var38 = var16;
               var16 = var18;
               var18 = var38;
               var38 = var19;
               var19 = var21;
               var21 = var38;
               var38 = var13;
               var13 = var15;
               var15 = var38;
               var38 = var26;
               var26 = var28;
               var28 = var38;
               var38 = var31;
               var31 = var37;
               var37 = var38;
               var39 = var22;
               var22 = var24;
               var24 = var39;
               var39 = var30;
               var30 = var36;
               var36 = var39;
               var39 = var29;
               var29 = var35;
               var35 = var39;
            }
         }

         int var98 = (var29 & '\uffff') << 16 | var30 & '\uffff';
         var39 = (var32 & '\uffff') << 16 | var33 & '\uffff';
         int var40 = (var35 & '\uffff') << 16 | var36 & '\uffff';
         int var96;
         int var97;
         if(var98 != anInt1734) {
            anIntArray1725 = aClass103_Sub2_1743.method15389(var29, var30);
            if(anIntArray1725 == null) {
               anInt1734 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var29), 2014625391) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1734 = var98;
            anInt1752 = aClass103_Sub2_1743.method15365(var29);
            anInt1744 = anInt1752 - 1;
            aClass529_1746 = aClass103_Sub2_1743.method15366(var29);
         }

         aFloat1745 = var31;
         if(var39 != anInt1749) {
            anIntArray1750 = aClass103_Sub2_1743.method15389(var32, var33);
            if(anIntArray1750 == null) {
               anInt1749 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var32), -547701251) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1749 = var39;
            anInt1757 = aClass103_Sub2_1743.method15365(var32);
            anInt1742 = anInt1757 - 1;
         }

         aFloat1753 = var34;
         if(var40 != anInt1754) {
            anIntArray1755 = aClass103_Sub2_1743.method15389(var35, var36);
            if(anIntArray1755 == null) {
               anInt1754 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var35), 2309733) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, (float)((int)var4), (float)((int)var5), (float)((int)var6), (float)((int)var7), (float)((int)var8), (float)((int)var9), (float)((int)var10), (float)((int)var11), (float)((int)var12), Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1754 = var40;
            anInt1738 = aClass103_Sub2_1743.method15365(var35);
            anInt1735 = anInt1738 - 1;
         }

         aFloat1758 = var37;
         var16 /= var13;
         var17 /= var14;
         var18 /= var15;
         var19 /= var13;
         var20 /= var14;
         var21 /= var15;
         var10 = 1.0F / var10;
         var11 = 1.0F / var11;
         var12 = 1.0F / var12;
         var13 = 1.0F / var13;
         var14 = 1.0F / var14;
         var15 = 1.0F / var15;
         float var41 = (float)(var22 >> 24 & 255);
         float var42 = (float)(var23 >> 24 & 255);
         float var43 = (float)(var24 >> 24 & 255);
         float var44 = (float)(var22 >> 16 & 255);
         float var45 = (float)(var23 >> 16 & 255);
         float var46 = (float)(var24 >> 16 & 255);
         float var47 = (float)(var22 >> 8 & 255);
         float var48 = (float)(var23 >> 8 & 255);
         float var49 = (float)(var24 >> 8 & 255);
         float var50 = (float)(var22 & 255);
         float var51 = (float)(var23 & 255);
         float var52 = (float)(var24 & 255);
         float var53 = 1.0F;
         float var54 = 0.0F;
         float var55 = 0.0F;
         float var56 = 0.0F;
         float var57 = 1.0F;
         float var58 = 0.0F;
         float var59 = 0.0F;
         float var60 = 0.0F;
         float var61 = 0.0F;
         float var62 = 0.0F;
         float var63 = 0.0F;
         float var64 = 0.0F;
         float var65 = 0.0F;
         float var66 = 0.0F;
         float var67 = 0.0F;
         float var68 = 0.0F;
         float var69 = 0.0F;
         float var70 = 0.0F;
         float var71;
         if(var5 != var4) {
            var71 = var5 - var4;
            var59 = (var8 - var7) / var71;
            var60 = (var11 - var10) / var71;
            var61 = (var14 - var13) / var71;
            var62 = (var17 - var16) / var71;
            var63 = (var20 - var19) / var71;
            var64 = (var27 - var26) / var71;
            var65 = (var42 - var41) / var71;
            var66 = (var45 - var44) / var71;
            var67 = (var48 - var47) / var71;
            var68 = (var51 - var50) / var71;
            var69 = (var54 - var53) / var71;
            var70 = (var57 - var56) / var71;
         }

         var71 = 0.0F;
         float var72 = 0.0F;
         float var73 = 0.0F;
         float var74 = 0.0F;
         float var75 = 0.0F;
         float var76 = 0.0F;
         float var77 = 0.0F;
         float var78 = 0.0F;
         float var79 = 0.0F;
         float var80 = 0.0F;
         float var81 = 0.0F;
         float var82 = 0.0F;
         float var83;
         if(var6 != var5) {
            var83 = var6 - var5;
            var71 = (var9 - var8) / var83;
            var72 = (var12 - var11) / var83;
            var73 = (var15 - var14) / var83;
            var74 = (var18 - var17) / var83;
            var75 = (var21 - var20) / var83;
            var76 = (var28 - var27) / var83;
            var77 = (var43 - var42) / var83;
            var78 = (var46 - var45) / var83;
            var79 = (var49 - var48) / var83;
            var80 = (var52 - var51) / var83;
            var81 = (var55 - var54) / var83;
            var82 = (var58 - var57) / var83;
         }

         var83 = 0.0F;
         float var84 = 0.0F;
         float var85 = 0.0F;
         float var86 = 0.0F;
         float var87 = 0.0F;
         float var88 = 0.0F;
         float var89 = 0.0F;
         float var90 = 0.0F;
         float var91 = 0.0F;
         float var92 = 0.0F;
         float var93 = 0.0F;
         float var94 = 0.0F;
         if(var4 != var6) {
            float var95 = var4 - var6;
            var83 = (var7 - var9) / var95;
            var84 = (var10 - var12) / var95;
            var85 = (var13 - var15) / var95;
            var86 = (var16 - var18) / var95;
            var87 = (var19 - var21) / var95;
            var88 = (var26 - var28) / var95;
            var89 = (var41 - var43) / var95;
            var90 = (var44 - var46) / var95;
            var91 = (var47 - var49) / var95;
            var92 = (var50 - var52) / var95;
            var93 = (var53 - var55) / var95;
            var94 = (var56 - var58) / var95;
         }

         if(var4 < (float)anInt1726) {
            if(var5 > (float)anInt1726) {
               var5 = (float)anInt1726;
            }

            if(var6 > (float)anInt1726) {
               var6 = (float)anInt1726;
            }

            if(var5 < var6) {
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var21 = var19;
               var28 = var26;
               var43 = var41;
               var46 = var44;
               var49 = var47;
               var52 = var50;
               var55 = var53;
               var58 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var9 -= var83 * var4;
                  var10 -= var60 * var4;
                  var12 -= var84 * var4;
                  var13 -= var61 * var4;
                  var15 -= var85 * var4;
                  var16 -= var62 * var4;
                  var18 -= var86 * var4;
                  var19 -= var63 * var4;
                  var21 -= var87 * var4;
                  var26 -= var64 * var4;
                  var28 -= var88 * var4;
                  var41 -= var65 * var4;
                  var43 -= var89 * var4;
                  var44 -= var66 * var4;
                  var46 -= var90 * var4;
                  var47 -= var67 * var4;
                  var49 -= var91 * var4;
                  var50 -= var68 * var4;
                  var52 -= var92 * var4;
                  var53 -= var69 * var4;
                  var55 -= var93 * var4;
                  var56 -= var70 * var4;
                  var58 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var5 < 0.0F) {
                  var8 -= var71 * var5;
                  var11 -= var72 * var5;
                  var14 -= var73 * var5;
                  var17 -= var74 * var5;
                  var20 -= var75 * var5;
                  var27 -= var76 * var5;
                  var42 -= var77 * var5;
                  var45 -= var78 * var5;
                  var48 -= var79 * var5;
                  var51 -= var80 * var5;
                  var54 -= var81 * var5;
                  var57 -= var82 * var5;
                  var5 = 0.0F;
               }

               if((var4 == var5 || var83 >= var59) && (var4 != var5 || var83 <= var71)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var8, (int)var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var42, var43, var45, var46, var48, var49, var51, var52, var54, var55, var57, var58);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var43, var42, var46, var45, var49, var48, var52, var51, var55, var54, var58, var57);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)anInt1737;
                  }
               }
            } else {
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var20 = var19;
               var27 = var26;
               var42 = var41;
               var45 = var44;
               var48 = var47;
               var51 = var50;
               var54 = var53;
               var57 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var8 -= var83 * var4;
                  var10 -= var60 * var4;
                  var11 -= var84 * var4;
                  var13 -= var61 * var4;
                  var14 -= var85 * var4;
                  var16 -= var62 * var4;
                  var17 -= var86 * var4;
                  var19 -= var63 * var4;
                  var20 -= var87 * var4;
                  var26 -= var64 * var4;
                  var27 -= var88 * var4;
                  var41 -= var65 * var4;
                  var42 -= var89 * var4;
                  var44 -= var66 * var4;
                  var45 -= var90 * var4;
                  var47 -= var67 * var4;
                  var48 -= var91 * var4;
                  var50 -= var68 * var4;
                  var51 -= var92 * var4;
                  var53 -= var69 * var4;
                  var54 -= var93 * var4;
                  var56 -= var70 * var4;
                  var57 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var6 < 0.0F) {
                  var9 -= var71 * var6;
                  var12 -= var72 * var6;
                  var15 -= var73 * var6;
                  var18 -= var74 * var6;
                  var21 -= var75 * var6;
                  var28 -= var76 * var6;
                  var43 -= var77 * var6;
                  var46 -= var78 * var6;
                  var49 -= var79 * var6;
                  var52 -= var80 * var6;
                  var55 -= var81 * var6;
                  var58 -= var82 * var6;
                  var6 = 0.0F;
               }

               if((var4 == var6 || var83 >= var59) && (var4 != var6 || var71 <= var59)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var41, var42, var44, var45, var47, var48, var50, var51, var53, var54, var56, var57);
                     var8 += var83;
                     var7 += var59;
                     var11 += var84;
                     var10 += var60;
                     var14 += var85;
                     var13 += var61;
                     var17 += var86;
                     var16 += var62;
                     var20 += var87;
                     var19 += var63;
                     var27 += var88;
                     var26 += var64;
                     var42 += var89;
                     var41 += var65;
                     var45 += var90;
                     var44 += var66;
                     var48 += var91;
                     var47 += var67;
                     var51 += var92;
                     var50 += var68;
                     var54 += var93;
                     var53 += var69;
                     var57 += var94;
                     var56 += var70;
                  }

                  while(--var5 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var71;
                     var10 += var60;
                     var12 += var72;
                     var13 += var61;
                     var15 += var73;
                     var16 += var62;
                     var18 += var74;
                     var19 += var63;
                     var21 += var75;
                     var26 += var64;
                     var28 += var76;
                     var41 += var65;
                     var43 += var77;
                     var44 += var66;
                     var46 += var78;
                     var47 += var67;
                     var49 += var79;
                     var50 += var68;
                     var52 += var80;
                     var53 += var69;
                     var55 += var81;
                     var56 += var70;
                     var58 += var82;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var8, (int)var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var42, var41, var45, var44, var48, var47, var51, var50, var54, var53, var57, var56);
                     var7 += var59;
                     var8 += var83;
                     var10 += var60;
                     var11 += var84;
                     var13 += var61;
                     var14 += var85;
                     var16 += var62;
                     var17 += var86;
                     var19 += var63;
                     var20 += var87;
                     var26 += var64;
                     var27 += var88;
                     var41 += var65;
                     var42 += var89;
                     var44 += var66;
                     var45 += var90;
                     var47 += var67;
                     var48 += var91;
                     var50 += var68;
                     var51 += var92;
                     var53 += var69;
                     var54 += var93;
                     var56 += var70;
                     var57 += var94;
                  }

                  while(--var5 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var9 += var71;
                     var7 += var59;
                     var12 += var72;
                     var10 += var60;
                     var15 += var73;
                     var13 += var61;
                     var18 += var74;
                     var16 += var62;
                     var21 += var75;
                     var19 += var63;
                     var28 += var76;
                     var26 += var64;
                     var43 += var77;
                     var41 += var65;
                     var46 += var78;
                     var44 += var66;
                     var49 += var79;
                     var47 += var67;
                     var52 += var80;
                     var50 += var68;
                     var55 += var81;
                     var53 += var69;
                     var58 += var82;
                     var56 += var70;
                     var4 += (float)anInt1737;
                  }
               }
            }

         }
      }
   }

   final void method3380(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else if(aBool1724) {
         aClass103_Sub2_1743.method2517((int)var7, (int)var4, (int)var8, (int)var5, Class474.anIntArray6382[(int)var13 & '\uffff'], 223909001);
         aClass103_Sub2_1743.method2517((int)var8, (int)var5, (int)var9, (int)var6, Class474.anIntArray6382[(int)var13 & '\uffff'], 223909001);
         aClass103_Sub2_1743.method2517((int)var9, (int)var6, (int)var7, (int)var4, Class474.anIntArray6382[(int)var13 & '\uffff'], 223909001);
      } else {
         float var16 = var8 - var7;
         float var17 = var5 - var4;
         float var18 = var9 - var7;
         float var19 = var6 - var4;
         float var20 = var14 - var13;
         float var21 = var15 - var13;
         float var22 = var11 - var10;
         float var23 = var12 - var10;
         float var24;
         if(var6 != var5) {
            var24 = (var9 - var8) / (var6 - var5);
         } else {
            var24 = 0.0F;
         }

         float var25;
         if(var5 != var4) {
            var25 = var16 / var17;
         } else {
            var25 = 0.0F;
         }

         float var26;
         if(var6 != var4) {
            var26 = var18 / var19;
         } else {
            var26 = 0.0F;
         }

         float var27 = var16 * var19 - var18 * var17;
         if(var27 != 0.0F) {
            float var28 = (var20 * var19 - var21 * var17) / var27;
            float var29 = (var21 * var16 - var20 * var18) / var27;
            float var30 = (var22 * var19 - var23 * var17) / var27;
            float var31 = (var23 * var16 - var22 * var18) / var27;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)anInt1726) {
                  if(var5 > (float)anInt1726) {
                     var5 = (float)anInt1726;
                  }

                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  var13 = var13 - var28 * var7 + var28;
                  var10 = var10 - var30 * var7 + var30;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var26 * var4;
                        var7 -= var25 * var4;
                        var13 -= var29 * var4;
                        var10 -= var31 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var24 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var26 >= var25) && (var4 != var5 || var26 <= var24)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var13, var28, var10, var30);
                           var9 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var9, var13, var28, var10, var30);
                           var9 += var26;
                           var8 += var24;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var13, var28, var10, var30);
                           var9 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var8, var13, var28, var10, var30);
                           var9 += var26;
                           var8 += var24;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var26 * var4;
                        var7 -= var25 * var4;
                        var13 -= var29 * var4;
                        var10 -= var31 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var24 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var26 >= var25) && (var4 != var6 || var24 <= var25)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var8, var13, var28, var10, var30);
                           var8 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var5 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var13, var28, var10, var30);
                           var9 += var24;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var7, var13, var28, var10, var30);
                           var8 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var5 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var13, var28, var10, var30);
                           var9 += var24;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)anInt1726) {
                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  if(var4 > (float)anInt1726) {
                     var4 = (float)anInt1726;
                  }

                  var14 = var14 - var28 * var8 + var28;
                  var11 = var11 - var30 * var8 + var30;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var25 * var5;
                        var8 -= var24 * var5;
                        var14 -= var29 * var5;
                        var11 -= var31 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var26 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var25 >= var24) && (var5 != var6 || var25 <= var26)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var14, var28, var11, var30);
                           var7 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var4 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var7, var14, var28, var11, var30);
                           var7 += var25;
                           var9 += var26;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var14, var28, var11, var30);
                           var7 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var4 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var9, var14, var28, var11, var30);
                           var7 += var25;
                           var9 += var26;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var25 * var5;
                        var8 -= var24 * var5;
                        var14 -= var29 * var5;
                        var11 -= var31 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var26 * var4;
                        var4 = 0.0F;
                     }

                     if(var25 < var24) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var8, var14, var28, var11, var30);
                           var9 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var14, var28, var11, var30);
                           var7 += var26;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var9, var14, var28, var11, var30);
                           var9 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           method3347(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var14, var28, var11, var30);
                           var7 += var26;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var6 < (float)anInt1726) {
               if(var4 > (float)anInt1726) {
                  var4 = (float)anInt1726;
               }

               if(var5 > (float)anInt1726) {
                  var5 = (float)anInt1726;
               }

               var15 = var15 - var28 * var9 + var28;
               var12 = var12 - var30 * var9 + var30;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var24 * var6;
                     var9 -= var26 * var6;
                     var15 -= var29 * var6;
                     var12 -= var31 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var25 * var4;
                     var4 = 0.0F;
                  }

                  if(var24 < var26) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var15, var28, var12, var30);
                        var8 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var5 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var7, var15, var28, var12, var30);
                        var8 += var24;
                        var7 += var25;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var15, var28, var12, var30);
                        var8 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var5 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var8, var15, var28, var12, var30);
                        var8 += var24;
                        var7 += var25;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var24 * var6;
                     var9 -= var26 * var6;
                     var15 -= var29 * var6;
                     var12 -= var31 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var25 * var5;
                     var5 = 0.0F;
                  }

                  if(var24 < var26) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var9, var15, var28, var12, var30);
                        var7 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var4 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var15, var28, var12, var30);
                        var8 += var25;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var7, var15, var28, var12, var30);
                        var7 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var4 >= 0.0F) {
                        method3347(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var15, var28, var12, var30);
                        var8 += var25;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)anInt1737;
                     }

                  }
               }
            }
         }
      }
   }

   final void method3381(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29, int var30, float var31, int var32, int var33, float var34, int var35, int var36, float var37) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else {
         anInt1740 = var25;
         int var39;
         if(var4 > var5 || var4 > var6) {
            float var38;
            if(var5 <= var6) {
               var38 = var7;
               var7 = var8;
               var8 = var38;
               var38 = var4;
               var4 = var5;
               var5 = var38;
               var38 = var10;
               var10 = var11;
               var11 = var38;
               var38 = var16;
               var16 = var17;
               var17 = var38;
               var38 = var19;
               var19 = var20;
               var20 = var38;
               var38 = var13;
               var13 = var14;
               var14 = var38;
               var38 = var26;
               var26 = var27;
               var27 = var38;
               var38 = var31;
               var31 = var34;
               var34 = var38;
               var39 = var22;
               var22 = var23;
               var23 = var39;
               var39 = var30;
               var30 = var33;
               var33 = var39;
               var39 = var29;
               var29 = var32;
               var32 = var39;
            } else {
               var38 = var7;
               var7 = var9;
               var9 = var38;
               var38 = var4;
               var4 = var6;
               var6 = var38;
               var38 = var10;
               var10 = var12;
               var12 = var38;
               var38 = var16;
               var16 = var18;
               var18 = var38;
               var38 = var19;
               var19 = var21;
               var21 = var38;
               var38 = var13;
               var13 = var15;
               var15 = var38;
               var38 = var26;
               var26 = var28;
               var28 = var38;
               var38 = var31;
               var31 = var37;
               var37 = var38;
               var39 = var22;
               var22 = var24;
               var24 = var39;
               var39 = var30;
               var30 = var36;
               var36 = var39;
               var39 = var29;
               var29 = var35;
               var35 = var39;
            }
         }

         int var98 = (var29 & '\uffff') << 16 | var30 & '\uffff';
         var39 = (var32 & '\uffff') << 16 | var33 & '\uffff';
         int var40 = (var35 & '\uffff') << 16 | var36 & '\uffff';
         int var96;
         int var97;
         if(var98 != anInt1734) {
            anIntArray1725 = aClass103_Sub2_1743.method15389(var29, var30);
            if(anIntArray1725 == null) {
               anInt1734 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var29), 155145138) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1734 = var98;
            anInt1752 = aClass103_Sub2_1743.method15365(var29);
            anInt1744 = anInt1752 - 1;
            aClass529_1746 = aClass103_Sub2_1743.method15366(var29);
         }

         aFloat1745 = var31;
         if(var39 != anInt1749) {
            anIntArray1750 = aClass103_Sub2_1743.method15389(var32, var33);
            if(anIntArray1750 == null) {
               anInt1749 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var32), 320825277) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1749 = var39;
            anInt1757 = aClass103_Sub2_1743.method15365(var32);
            anInt1742 = anInt1757 - 1;
         }

         aFloat1753 = var34;
         if(var40 != anInt1754) {
            anIntArray1755 = aClass103_Sub2_1743.method15389(var35, var36);
            if(anIntArray1755 == null) {
               anInt1754 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var35), -886695244) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, (float)((int)var4), (float)((int)var5), (float)((int)var6), (float)((int)var7), (float)((int)var8), (float)((int)var9), (float)((int)var10), (float)((int)var11), (float)((int)var12), Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1754 = var40;
            anInt1738 = aClass103_Sub2_1743.method15365(var35);
            anInt1735 = anInt1738 - 1;
         }

         aFloat1758 = var37;
         var16 /= var13;
         var17 /= var14;
         var18 /= var15;
         var19 /= var13;
         var20 /= var14;
         var21 /= var15;
         var10 = 1.0F / var10;
         var11 = 1.0F / var11;
         var12 = 1.0F / var12;
         var13 = 1.0F / var13;
         var14 = 1.0F / var14;
         var15 = 1.0F / var15;
         float var41 = (float)(var22 >> 24 & 255);
         float var42 = (float)(var23 >> 24 & 255);
         float var43 = (float)(var24 >> 24 & 255);
         float var44 = (float)(var22 >> 16 & 255);
         float var45 = (float)(var23 >> 16 & 255);
         float var46 = (float)(var24 >> 16 & 255);
         float var47 = (float)(var22 >> 8 & 255);
         float var48 = (float)(var23 >> 8 & 255);
         float var49 = (float)(var24 >> 8 & 255);
         float var50 = (float)(var22 & 255);
         float var51 = (float)(var23 & 255);
         float var52 = (float)(var24 & 255);
         float var53 = 1.0F;
         float var54 = 0.0F;
         float var55 = 0.0F;
         float var56 = 0.0F;
         float var57 = 1.0F;
         float var58 = 0.0F;
         float var59 = 0.0F;
         float var60 = 0.0F;
         float var61 = 0.0F;
         float var62 = 0.0F;
         float var63 = 0.0F;
         float var64 = 0.0F;
         float var65 = 0.0F;
         float var66 = 0.0F;
         float var67 = 0.0F;
         float var68 = 0.0F;
         float var69 = 0.0F;
         float var70 = 0.0F;
         float var71;
         if(var5 != var4) {
            var71 = var5 - var4;
            var59 = (var8 - var7) / var71;
            var60 = (var11 - var10) / var71;
            var61 = (var14 - var13) / var71;
            var62 = (var17 - var16) / var71;
            var63 = (var20 - var19) / var71;
            var64 = (var27 - var26) / var71;
            var65 = (var42 - var41) / var71;
            var66 = (var45 - var44) / var71;
            var67 = (var48 - var47) / var71;
            var68 = (var51 - var50) / var71;
            var69 = (var54 - var53) / var71;
            var70 = (var57 - var56) / var71;
         }

         var71 = 0.0F;
         float var72 = 0.0F;
         float var73 = 0.0F;
         float var74 = 0.0F;
         float var75 = 0.0F;
         float var76 = 0.0F;
         float var77 = 0.0F;
         float var78 = 0.0F;
         float var79 = 0.0F;
         float var80 = 0.0F;
         float var81 = 0.0F;
         float var82 = 0.0F;
         float var83;
         if(var6 != var5) {
            var83 = var6 - var5;
            var71 = (var9 - var8) / var83;
            var72 = (var12 - var11) / var83;
            var73 = (var15 - var14) / var83;
            var74 = (var18 - var17) / var83;
            var75 = (var21 - var20) / var83;
            var76 = (var28 - var27) / var83;
            var77 = (var43 - var42) / var83;
            var78 = (var46 - var45) / var83;
            var79 = (var49 - var48) / var83;
            var80 = (var52 - var51) / var83;
            var81 = (var55 - var54) / var83;
            var82 = (var58 - var57) / var83;
         }

         var83 = 0.0F;
         float var84 = 0.0F;
         float var85 = 0.0F;
         float var86 = 0.0F;
         float var87 = 0.0F;
         float var88 = 0.0F;
         float var89 = 0.0F;
         float var90 = 0.0F;
         float var91 = 0.0F;
         float var92 = 0.0F;
         float var93 = 0.0F;
         float var94 = 0.0F;
         if(var4 != var6) {
            float var95 = var4 - var6;
            var83 = (var7 - var9) / var95;
            var84 = (var10 - var12) / var95;
            var85 = (var13 - var15) / var95;
            var86 = (var16 - var18) / var95;
            var87 = (var19 - var21) / var95;
            var88 = (var26 - var28) / var95;
            var89 = (var41 - var43) / var95;
            var90 = (var44 - var46) / var95;
            var91 = (var47 - var49) / var95;
            var92 = (var50 - var52) / var95;
            var93 = (var53 - var55) / var95;
            var94 = (var56 - var58) / var95;
         }

         if(var4 < (float)anInt1726) {
            if(var5 > (float)anInt1726) {
               var5 = (float)anInt1726;
            }

            if(var6 > (float)anInt1726) {
               var6 = (float)anInt1726;
            }

            if(var5 < var6) {
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var21 = var19;
               var28 = var26;
               var43 = var41;
               var46 = var44;
               var49 = var47;
               var52 = var50;
               var55 = var53;
               var58 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var9 -= var83 * var4;
                  var10 -= var60 * var4;
                  var12 -= var84 * var4;
                  var13 -= var61 * var4;
                  var15 -= var85 * var4;
                  var16 -= var62 * var4;
                  var18 -= var86 * var4;
                  var19 -= var63 * var4;
                  var21 -= var87 * var4;
                  var26 -= var64 * var4;
                  var28 -= var88 * var4;
                  var41 -= var65 * var4;
                  var43 -= var89 * var4;
                  var44 -= var66 * var4;
                  var46 -= var90 * var4;
                  var47 -= var67 * var4;
                  var49 -= var91 * var4;
                  var50 -= var68 * var4;
                  var52 -= var92 * var4;
                  var53 -= var69 * var4;
                  var55 -= var93 * var4;
                  var56 -= var70 * var4;
                  var58 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var5 < 0.0F) {
                  var8 -= var71 * var5;
                  var11 -= var72 * var5;
                  var14 -= var73 * var5;
                  var17 -= var74 * var5;
                  var20 -= var75 * var5;
                  var27 -= var76 * var5;
                  var42 -= var77 * var5;
                  var45 -= var78 * var5;
                  var48 -= var79 * var5;
                  var51 -= var80 * var5;
                  var54 -= var81 * var5;
                  var57 -= var82 * var5;
                  var5 = 0.0F;
               }

               if((var4 == var5 || var83 >= var59) && (var4 != var5 || var83 <= var71)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var8, (int)var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var42, var43, var45, var46, var48, var49, var51, var52, var54, var55, var57, var58);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var43, var42, var46, var45, var49, var48, var52, var51, var55, var54, var58, var57);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)anInt1737;
                  }
               }
            } else {
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var20 = var19;
               var27 = var26;
               var42 = var41;
               var45 = var44;
               var48 = var47;
               var51 = var50;
               var54 = var53;
               var57 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var8 -= var83 * var4;
                  var10 -= var60 * var4;
                  var11 -= var84 * var4;
                  var13 -= var61 * var4;
                  var14 -= var85 * var4;
                  var16 -= var62 * var4;
                  var17 -= var86 * var4;
                  var19 -= var63 * var4;
                  var20 -= var87 * var4;
                  var26 -= var64 * var4;
                  var27 -= var88 * var4;
                  var41 -= var65 * var4;
                  var42 -= var89 * var4;
                  var44 -= var66 * var4;
                  var45 -= var90 * var4;
                  var47 -= var67 * var4;
                  var48 -= var91 * var4;
                  var50 -= var68 * var4;
                  var51 -= var92 * var4;
                  var53 -= var69 * var4;
                  var54 -= var93 * var4;
                  var56 -= var70 * var4;
                  var57 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var6 < 0.0F) {
                  var9 -= var71 * var6;
                  var12 -= var72 * var6;
                  var15 -= var73 * var6;
                  var18 -= var74 * var6;
                  var21 -= var75 * var6;
                  var28 -= var76 * var6;
                  var43 -= var77 * var6;
                  var46 -= var78 * var6;
                  var49 -= var79 * var6;
                  var52 -= var80 * var6;
                  var55 -= var81 * var6;
                  var58 -= var82 * var6;
                  var6 = 0.0F;
               }

               if((var4 == var6 || var83 >= var59) && (var4 != var6 || var71 <= var59)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var41, var42, var44, var45, var47, var48, var50, var51, var53, var54, var56, var57);
                     var8 += var83;
                     var7 += var59;
                     var11 += var84;
                     var10 += var60;
                     var14 += var85;
                     var13 += var61;
                     var17 += var86;
                     var16 += var62;
                     var20 += var87;
                     var19 += var63;
                     var27 += var88;
                     var26 += var64;
                     var42 += var89;
                     var41 += var65;
                     var45 += var90;
                     var44 += var66;
                     var48 += var91;
                     var47 += var67;
                     var51 += var92;
                     var50 += var68;
                     var54 += var93;
                     var53 += var69;
                     var57 += var94;
                     var56 += var70;
                  }

                  while(--var5 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var71;
                     var10 += var60;
                     var12 += var72;
                     var13 += var61;
                     var15 += var73;
                     var16 += var62;
                     var18 += var74;
                     var19 += var63;
                     var21 += var75;
                     var26 += var64;
                     var28 += var76;
                     var41 += var65;
                     var43 += var77;
                     var44 += var66;
                     var46 += var78;
                     var47 += var67;
                     var49 += var79;
                     var50 += var68;
                     var52 += var80;
                     var53 += var69;
                     var55 += var81;
                     var56 += var70;
                     var58 += var82;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var8, (int)var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var42, var41, var45, var44, var48, var47, var51, var50, var54, var53, var57, var56);
                     var7 += var59;
                     var8 += var83;
                     var10 += var60;
                     var11 += var84;
                     var13 += var61;
                     var14 += var85;
                     var16 += var62;
                     var17 += var86;
                     var19 += var63;
                     var20 += var87;
                     var26 += var64;
                     var27 += var88;
                     var41 += var65;
                     var42 += var89;
                     var44 += var66;
                     var45 += var90;
                     var47 += var67;
                     var48 += var91;
                     var50 += var68;
                     var51 += var92;
                     var53 += var69;
                     var54 += var93;
                     var56 += var70;
                     var57 += var94;
                  }

                  while(--var5 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var9 += var71;
                     var7 += var59;
                     var12 += var72;
                     var10 += var60;
                     var15 += var73;
                     var13 += var61;
                     var18 += var74;
                     var16 += var62;
                     var21 += var75;
                     var19 += var63;
                     var28 += var76;
                     var26 += var64;
                     var43 += var77;
                     var41 += var65;
                     var46 += var78;
                     var44 += var66;
                     var49 += var79;
                     var47 += var67;
                     var52 += var80;
                     var50 += var68;
                     var55 += var81;
                     var53 += var69;
                     var58 += var82;
                     var56 += var70;
                     var4 += (float)anInt1737;
                  }
               }
            }

         }
      }
   }

   final void method3382(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29, int var30, float var31, int var32, int var33, float var34, int var35, int var36, float var37) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else {
         anInt1740 = var25;
         int var39;
         if(var4 > var5 || var4 > var6) {
            float var38;
            if(var5 <= var6) {
               var38 = var7;
               var7 = var8;
               var8 = var38;
               var38 = var4;
               var4 = var5;
               var5 = var38;
               var38 = var10;
               var10 = var11;
               var11 = var38;
               var38 = var16;
               var16 = var17;
               var17 = var38;
               var38 = var19;
               var19 = var20;
               var20 = var38;
               var38 = var13;
               var13 = var14;
               var14 = var38;
               var38 = var26;
               var26 = var27;
               var27 = var38;
               var38 = var31;
               var31 = var34;
               var34 = var38;
               var39 = var22;
               var22 = var23;
               var23 = var39;
               var39 = var30;
               var30 = var33;
               var33 = var39;
               var39 = var29;
               var29 = var32;
               var32 = var39;
            } else {
               var38 = var7;
               var7 = var9;
               var9 = var38;
               var38 = var4;
               var4 = var6;
               var6 = var38;
               var38 = var10;
               var10 = var12;
               var12 = var38;
               var38 = var16;
               var16 = var18;
               var18 = var38;
               var38 = var19;
               var19 = var21;
               var21 = var38;
               var38 = var13;
               var13 = var15;
               var15 = var38;
               var38 = var26;
               var26 = var28;
               var28 = var38;
               var38 = var31;
               var31 = var37;
               var37 = var38;
               var39 = var22;
               var22 = var24;
               var24 = var39;
               var39 = var30;
               var30 = var36;
               var36 = var39;
               var39 = var29;
               var29 = var35;
               var35 = var39;
            }
         }

         int var98 = (var29 & '\uffff') << 16 | var30 & '\uffff';
         var39 = (var32 & '\uffff') << 16 | var33 & '\uffff';
         int var40 = (var35 & '\uffff') << 16 | var36 & '\uffff';
         int var96;
         int var97;
         if(var98 != anInt1734) {
            anIntArray1725 = aClass103_Sub2_1743.method15389(var29, var30);
            if(anIntArray1725 == null) {
               anInt1734 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var29), 580628505) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1734 = var98;
            anInt1752 = aClass103_Sub2_1743.method15365(var29);
            anInt1744 = anInt1752 - 1;
            aClass529_1746 = aClass103_Sub2_1743.method15366(var29);
         }

         aFloat1745 = var31;
         if(var39 != anInt1749) {
            anIntArray1750 = aClass103_Sub2_1743.method15389(var32, var33);
            if(anIntArray1750 == null) {
               anInt1749 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var32), -76046514) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1749 = var39;
            anInt1757 = aClass103_Sub2_1743.method15365(var32);
            anInt1742 = anInt1757 - 1;
         }

         aFloat1753 = var34;
         if(var40 != anInt1754) {
            anIntArray1755 = aClass103_Sub2_1743.method15389(var35, var36);
            if(anIntArray1755 == null) {
               anInt1754 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               var96 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var35), -1226669089) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               method3385(true, var2, var3, (float)((int)var4), (float)((int)var5), (float)((int)var6), (float)((int)var7), (float)((int)var8), (float)((int)var9), (float)((int)var10), (float)((int)var11), (float)((int)var12), Class54.method1306(var97, var25, var26, 1372221625), Class54.method1306(var97, var25, var27, 1372221625), Class54.method1306(var97, var25, var28, 1372221625));
               return;
            }

            anInt1754 = var40;
            anInt1738 = aClass103_Sub2_1743.method15365(var35);
            anInt1735 = anInt1738 - 1;
         }

         aFloat1758 = var37;
         var16 /= var13;
         var17 /= var14;
         var18 /= var15;
         var19 /= var13;
         var20 /= var14;
         var21 /= var15;
         var10 = 1.0F / var10;
         var11 = 1.0F / var11;
         var12 = 1.0F / var12;
         var13 = 1.0F / var13;
         var14 = 1.0F / var14;
         var15 = 1.0F / var15;
         float var41 = (float)(var22 >> 24 & 255);
         float var42 = (float)(var23 >> 24 & 255);
         float var43 = (float)(var24 >> 24 & 255);
         float var44 = (float)(var22 >> 16 & 255);
         float var45 = (float)(var23 >> 16 & 255);
         float var46 = (float)(var24 >> 16 & 255);
         float var47 = (float)(var22 >> 8 & 255);
         float var48 = (float)(var23 >> 8 & 255);
         float var49 = (float)(var24 >> 8 & 255);
         float var50 = (float)(var22 & 255);
         float var51 = (float)(var23 & 255);
         float var52 = (float)(var24 & 255);
         float var53 = 1.0F;
         float var54 = 0.0F;
         float var55 = 0.0F;
         float var56 = 0.0F;
         float var57 = 1.0F;
         float var58 = 0.0F;
         float var59 = 0.0F;
         float var60 = 0.0F;
         float var61 = 0.0F;
         float var62 = 0.0F;
         float var63 = 0.0F;
         float var64 = 0.0F;
         float var65 = 0.0F;
         float var66 = 0.0F;
         float var67 = 0.0F;
         float var68 = 0.0F;
         float var69 = 0.0F;
         float var70 = 0.0F;
         float var71;
         if(var5 != var4) {
            var71 = var5 - var4;
            var59 = (var8 - var7) / var71;
            var60 = (var11 - var10) / var71;
            var61 = (var14 - var13) / var71;
            var62 = (var17 - var16) / var71;
            var63 = (var20 - var19) / var71;
            var64 = (var27 - var26) / var71;
            var65 = (var42 - var41) / var71;
            var66 = (var45 - var44) / var71;
            var67 = (var48 - var47) / var71;
            var68 = (var51 - var50) / var71;
            var69 = (var54 - var53) / var71;
            var70 = (var57 - var56) / var71;
         }

         var71 = 0.0F;
         float var72 = 0.0F;
         float var73 = 0.0F;
         float var74 = 0.0F;
         float var75 = 0.0F;
         float var76 = 0.0F;
         float var77 = 0.0F;
         float var78 = 0.0F;
         float var79 = 0.0F;
         float var80 = 0.0F;
         float var81 = 0.0F;
         float var82 = 0.0F;
         float var83;
         if(var6 != var5) {
            var83 = var6 - var5;
            var71 = (var9 - var8) / var83;
            var72 = (var12 - var11) / var83;
            var73 = (var15 - var14) / var83;
            var74 = (var18 - var17) / var83;
            var75 = (var21 - var20) / var83;
            var76 = (var28 - var27) / var83;
            var77 = (var43 - var42) / var83;
            var78 = (var46 - var45) / var83;
            var79 = (var49 - var48) / var83;
            var80 = (var52 - var51) / var83;
            var81 = (var55 - var54) / var83;
            var82 = (var58 - var57) / var83;
         }

         var83 = 0.0F;
         float var84 = 0.0F;
         float var85 = 0.0F;
         float var86 = 0.0F;
         float var87 = 0.0F;
         float var88 = 0.0F;
         float var89 = 0.0F;
         float var90 = 0.0F;
         float var91 = 0.0F;
         float var92 = 0.0F;
         float var93 = 0.0F;
         float var94 = 0.0F;
         if(var4 != var6) {
            float var95 = var4 - var6;
            var83 = (var7 - var9) / var95;
            var84 = (var10 - var12) / var95;
            var85 = (var13 - var15) / var95;
            var86 = (var16 - var18) / var95;
            var87 = (var19 - var21) / var95;
            var88 = (var26 - var28) / var95;
            var89 = (var41 - var43) / var95;
            var90 = (var44 - var46) / var95;
            var91 = (var47 - var49) / var95;
            var92 = (var50 - var52) / var95;
            var93 = (var53 - var55) / var95;
            var94 = (var56 - var58) / var95;
         }

         if(var4 < (float)anInt1726) {
            if(var5 > (float)anInt1726) {
               var5 = (float)anInt1726;
            }

            if(var6 > (float)anInt1726) {
               var6 = (float)anInt1726;
            }

            if(var5 < var6) {
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var21 = var19;
               var28 = var26;
               var43 = var41;
               var46 = var44;
               var49 = var47;
               var52 = var50;
               var55 = var53;
               var58 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var9 -= var83 * var4;
                  var10 -= var60 * var4;
                  var12 -= var84 * var4;
                  var13 -= var61 * var4;
                  var15 -= var85 * var4;
                  var16 -= var62 * var4;
                  var18 -= var86 * var4;
                  var19 -= var63 * var4;
                  var21 -= var87 * var4;
                  var26 -= var64 * var4;
                  var28 -= var88 * var4;
                  var41 -= var65 * var4;
                  var43 -= var89 * var4;
                  var44 -= var66 * var4;
                  var46 -= var90 * var4;
                  var47 -= var67 * var4;
                  var49 -= var91 * var4;
                  var50 -= var68 * var4;
                  var52 -= var92 * var4;
                  var53 -= var69 * var4;
                  var55 -= var93 * var4;
                  var56 -= var70 * var4;
                  var58 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var5 < 0.0F) {
                  var8 -= var71 * var5;
                  var11 -= var72 * var5;
                  var14 -= var73 * var5;
                  var17 -= var74 * var5;
                  var20 -= var75 * var5;
                  var27 -= var76 * var5;
                  var42 -= var77 * var5;
                  var45 -= var78 * var5;
                  var48 -= var79 * var5;
                  var51 -= var80 * var5;
                  var54 -= var81 * var5;
                  var57 -= var82 * var5;
                  var5 = 0.0F;
               }

               if((var4 == var5 || var83 >= var59) && (var4 != var5 || var83 <= var71)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var8, (int)var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var42, var43, var45, var46, var48, var49, var51, var52, var54, var55, var57, var58);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var43, var42, var46, var45, var49, var48, var52, var51, var55, var54, var58, var57);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)anInt1737;
                  }
               }
            } else {
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var20 = var19;
               var27 = var26;
               var42 = var41;
               var45 = var44;
               var48 = var47;
               var51 = var50;
               var54 = var53;
               var57 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var8 -= var83 * var4;
                  var10 -= var60 * var4;
                  var11 -= var84 * var4;
                  var13 -= var61 * var4;
                  var14 -= var85 * var4;
                  var16 -= var62 * var4;
                  var17 -= var86 * var4;
                  var19 -= var63 * var4;
                  var20 -= var87 * var4;
                  var26 -= var64 * var4;
                  var27 -= var88 * var4;
                  var41 -= var65 * var4;
                  var42 -= var89 * var4;
                  var44 -= var66 * var4;
                  var45 -= var90 * var4;
                  var47 -= var67 * var4;
                  var48 -= var91 * var4;
                  var50 -= var68 * var4;
                  var51 -= var92 * var4;
                  var53 -= var69 * var4;
                  var54 -= var93 * var4;
                  var56 -= var70 * var4;
                  var57 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var6 < 0.0F) {
                  var9 -= var71 * var6;
                  var12 -= var72 * var6;
                  var15 -= var73 * var6;
                  var18 -= var74 * var6;
                  var21 -= var75 * var6;
                  var28 -= var76 * var6;
                  var43 -= var77 * var6;
                  var46 -= var78 * var6;
                  var49 -= var79 * var6;
                  var52 -= var80 * var6;
                  var55 -= var81 * var6;
                  var58 -= var82 * var6;
                  var6 = 0.0F;
               }

               if((var4 == var6 || var83 >= var59) && (var4 != var6 || var71 <= var59)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var41, var42, var44, var45, var47, var48, var50, var51, var53, var54, var56, var57);
                     var8 += var83;
                     var7 += var59;
                     var11 += var84;
                     var10 += var60;
                     var14 += var85;
                     var13 += var61;
                     var17 += var86;
                     var16 += var62;
                     var20 += var87;
                     var19 += var63;
                     var27 += var88;
                     var26 += var64;
                     var42 += var89;
                     var41 += var65;
                     var45 += var90;
                     var44 += var66;
                     var48 += var91;
                     var47 += var67;
                     var51 += var92;
                     var50 += var68;
                     var54 += var93;
                     var53 += var69;
                     var57 += var94;
                     var56 += var70;
                  }

                  while(--var5 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var71;
                     var10 += var60;
                     var12 += var72;
                     var13 += var61;
                     var15 += var73;
                     var16 += var62;
                     var18 += var74;
                     var19 += var63;
                     var21 += var75;
                     var26 += var64;
                     var28 += var76;
                     var41 += var65;
                     var43 += var77;
                     var44 += var66;
                     var46 += var78;
                     var47 += var67;
                     var49 += var79;
                     var50 += var68;
                     var52 += var80;
                     var53 += var69;
                     var55 += var81;
                     var56 += var70;
                     var58 += var82;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var8, (int)var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var42, var41, var45, var44, var48, var47, var51, var50, var54, var53, var57, var56);
                     var7 += var59;
                     var8 += var83;
                     var10 += var60;
                     var11 += var84;
                     var13 += var61;
                     var14 += var85;
                     var16 += var62;
                     var17 += var86;
                     var19 += var63;
                     var20 += var87;
                     var26 += var64;
                     var27 += var88;
                     var41 += var65;
                     var42 += var89;
                     var44 += var66;
                     var45 += var90;
                     var47 += var67;
                     var48 += var91;
                     var50 += var68;
                     var51 += var92;
                     var53 += var69;
                     var54 += var93;
                     var56 += var70;
                     var57 += var94;
                  }

                  while(--var5 >= 0.0F) {
                     method3343(var2, var3, anIntArray1751, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var9 += var71;
                     var7 += var59;
                     var12 += var72;
                     var10 += var60;
                     var15 += var73;
                     var13 += var61;
                     var18 += var74;
                     var16 += var62;
                     var21 += var75;
                     var19 += var63;
                     var28 += var76;
                     var26 += var64;
                     var43 += var77;
                     var41 += var65;
                     var46 += var78;
                     var44 += var66;
                     var49 += var79;
                     var47 += var67;
                     var52 += var80;
                     var50 += var68;
                     var55 += var81;
                     var53 += var69;
                     var58 += var82;
                     var56 += var70;
                     var4 += (float)anInt1737;
                  }
               }
            }

         }
      }
   }

   final void method3383(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25, float var26, float var27, float var28) {
      int var29 = var6 - var5;
      float var30 = 1.0F / (float)var29;
      float var31 = (var8 - var7) * var30;
      float var32 = (var10 - var9) * var30;
      float var33 = (var12 - var11) * var30;
      float var34 = (var14 - var13) * var30;
      float var35 = (var16 - var15) * var30;
      float var36 = (var18 - var17) * var30;
      float var37 = (var20 - var19) * var30;
      float var38 = (var22 - var21) * var30;
      float var39 = (var24 - var23) * var30;
      float var40 = (var26 - var25) * var30;
      float var41 = (var28 - var27) * var30;
      if(aBool1748) {
         if(var6 > anInt1733) {
            var6 = anInt1733;
         }

         if(var5 < 0) {
            var7 -= var31 * (float)var5;
            var9 -= var32 * (float)var5;
            var11 -= var33 * (float)var5;
            var13 -= var34 * (float)var5;
            var15 -= var35 * (float)var5;
            var17 -= var36 * (float)var5;
            var19 -= var37 * (float)var5;
            var21 -= var38 * (float)var5;
            var23 -= var39 * (float)var5;
            var25 -= var40 * (float)var5;
            var27 -= var41 * (float)var5;
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var29 = var6 - var5;

         for(var4 += var5; var29-- > 0; var27 += var41) {
            float var42 = 1.0F / var7;
            float var43 = 1.0F / var9;
            if(!var1 || var42 < aFloatArray1739[var4]) {
               float var44 = var11 * var43;
               float var45 = var13 * var43;
               int var46 = (int)(var44 * (float)anInt1752 * aFloat1745) & anInt1744;
               int var47 = (int)(var45 * (float)anInt1752 * aFloat1745) & anInt1744;
               int var48 = anIntArray1725[var47 * anInt1752 + var46];
               var46 = (int)(var44 * (float)anInt1757 * aFloat1753) & anInt1742;
               var47 = (int)(var45 * (float)anInt1757 * aFloat1753) & anInt1742;
               int var49 = anIntArray1750[var47 * anInt1757 + var46];
               var46 = (int)(var44 * (float)anInt1738 * aFloat1758) & anInt1735;
               var47 = (int)(var45 * (float)anInt1738 * aFloat1758) & anInt1735;
               int var50 = anIntArray1755[var47 * anInt1738 + var46];
               float var51 = 1.0F - (var25 + var27);
               var48 = -16777216 | (int)(var25 * (float)(var48 >> 16 & 255)) << 16 | (int)(var25 * (float)(var48 >> 8 & 255)) << 8 | (int)(var25 * (float)(var48 & 255));
               var49 = -16777216 | (int)(var27 * (float)(var49 >> 16 & 255)) << 16 | (int)(var27 * (float)(var49 >> 8 & 255)) << 8 | (int)(var27 * (float)(var49 & 255));
               var50 = -16777216 | (int)(var51 * (float)(var50 >> 16 & 255)) << 16 | (int)(var51 * (float)(var50 >> 8 & 255)) << 8 | (int)(var51 * (float)(var50 & 255));
               int var52 = var48 + var49 + var50;
               int var53 = -16777216 | (int)(var19 * (float)(var52 >> 16 & 255)) << 8 & 16711680 | (int)(var21 * (float)(var52 >> 8 & 255)) & '\uff00' | (int)(var23 * (float)(var52 & 255)) >> 8;
               if(var15 != 0.0F) {
                  int var54 = (int)(255.0F - var15);
                  int var55 = ((anInt1740 & 16711935) * (int)var15 & -16711936 | (anInt1740 & '\uff00') * (int)var15 & 16711680) >>> 8;
                  var53 = (((var53 & 16711935) * var54 & -16711936 | (var53 & '\uff00') * var54 & 16711680) >>> 8) + var55;
               }

               if(var2) {
                  var3[var4] = ((int)var17 | var3[var4] >> 24) << 24 | var53;
               } else {
                  var3[var4] = var53;
               }

               if(var1) {
                  aFloatArray1739[var4] = var42;
               }
            }

            ++var4;
            var7 += var31;
            var9 += var32;
            var11 += var33;
            var13 += var34;
            var15 += var35;
            var17 += var36;
            var19 += var37;
            var21 += var38;
            var23 += var39;
            var25 += var40;
         }

      }
   }

   final void method3384(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29, int var30) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else {
         int var31 = (var29 & '\uffff') << 16 | var30 & '\uffff';
         int var33;
         if(var31 != anInt1734) {
            anIntArray1725 = aClass103_Sub2_1743.method15389(var29, var30);
            if(anIntArray1725 == null) {
               anInt1734 = -1;
               anInt1723 = 255 - (var22 >> 24 & 255);
               anInt1747 = 0;
               int var76 = Class474.anIntArray6382[Class241_Sub42.method16451(aClass103_Sub2_1743.method15368(var29), -291572925) & '\uffff'];
               var33 = -16777216 | (var22 >> 16 & 255) * (var76 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var76 >> 8 & 255) & '\uff00' | (var22 & 255) * (var76 & 255) >> 8;
               method3385(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class54.method1306(var33, var25, var26, 1372221625), Class54.method1306(var33, var25, var27, 1372221625), Class54.method1306(var33, var25, var28, 1372221625));
               return;
            }

            anInt1734 = var31;
            anInt1752 = aClass103_Sub2_1743.method15365(var29);
            anInt1744 = anInt1752 - 1;
            aClass529_1746 = aClass103_Sub2_1743.method15366(var29);
            aBool1741 = aClass103_Sub2_1743.method15396(var29);
            anInt1747 = aClass103_Sub2_1743.method15367(var29) & 255;
         }

         anInt1740 = var25;
         float var32;
         if(var4 > var5 || var4 > var6) {
            if(var5 <= var6) {
               var32 = var7;
               var7 = var8;
               var8 = var32;
               var32 = var4;
               var4 = var5;
               var5 = var32;
               var32 = var10;
               var10 = var11;
               var11 = var32;
               var32 = var16;
               var16 = var17;
               var17 = var32;
               var32 = var19;
               var19 = var20;
               var20 = var32;
               var32 = var13;
               var13 = var14;
               var14 = var32;
               var32 = var26;
               var26 = var27;
               var27 = var32;
               var33 = var22;
               var22 = var23;
               var23 = var33;
            } else {
               var32 = var7;
               var7 = var9;
               var9 = var32;
               var32 = var4;
               var4 = var6;
               var6 = var32;
               var32 = var10;
               var10 = var12;
               var12 = var32;
               var32 = var16;
               var16 = var18;
               var18 = var32;
               var32 = var19;
               var19 = var21;
               var21 = var32;
               var32 = var13;
               var13 = var15;
               var15 = var32;
               var32 = var26;
               var26 = var28;
               var28 = var32;
               var33 = var22;
               var22 = var24;
               var24 = var33;
            }
         }

         var16 /= var13;
         var17 /= var14;
         var18 /= var15;
         var19 /= var13;
         var20 /= var14;
         var21 /= var15;
         var10 = 1.0F / var10;
         var11 = 1.0F / var11;
         var12 = 1.0F / var12;
         var13 = 1.0F / var13;
         var14 = 1.0F / var14;
         var15 = 1.0F / var15;
         var32 = (float)(var22 >> 24 & 255);
         float var75 = (float)(var23 >> 24 & 255);
         float var34 = (float)(var24 >> 24 & 255);
         float var35 = (float)(var22 >> 16 & 255);
         float var36 = (float)(var23 >> 16 & 255);
         float var37 = (float)(var24 >> 16 & 255);
         float var38 = (float)(var22 >> 8 & 255);
         float var39 = (float)(var23 >> 8 & 255);
         float var40 = (float)(var24 >> 8 & 255);
         float var41 = (float)(var22 & 255);
         float var42 = (float)(var23 & 255);
         float var43 = (float)(var24 & 255);
         float var44 = 0.0F;
         float var45 = 0.0F;
         float var46 = 0.0F;
         float var47 = 0.0F;
         float var48 = 0.0F;
         float var49 = 0.0F;
         float var50 = 0.0F;
         float var51 = 0.0F;
         float var52 = 0.0F;
         float var53 = 0.0F;
         float var54;
         if(var5 != var4) {
            var54 = var5 - var4;
            var44 = (var8 - var7) / var54;
            var45 = (var11 - var10) / var54;
            var46 = (var14 - var13) / var54;
            var47 = (var17 - var16) / var54;
            var48 = (var20 - var19) / var54;
            var49 = (var27 - var26) / var54;
            var50 = (var75 - var32) / var54;
            var51 = (var36 - var35) / var54;
            var52 = (var39 - var38) / var54;
            var53 = (var42 - var41) / var54;
         }

         var54 = 0.0F;
         float var55 = 0.0F;
         float var56 = 0.0F;
         float var57 = 0.0F;
         float var58 = 0.0F;
         float var59 = 0.0F;
         float var60 = 0.0F;
         float var61 = 0.0F;
         float var62 = 0.0F;
         float var63 = 0.0F;
         float var64;
         if(var6 != var5) {
            var64 = var6 - var5;
            var54 = (var9 - var8) / var64;
            var55 = (var12 - var11) / var64;
            var56 = (var15 - var14) / var64;
            var57 = (var18 - var17) / var64;
            var58 = (var21 - var20) / var64;
            var59 = (var28 - var27) / var64;
            var60 = (var34 - var75) / var64;
            var61 = (var37 - var36) / var64;
            var62 = (var40 - var39) / var64;
            var63 = (var43 - var42) / var64;
         }

         var64 = 0.0F;
         float var65 = 0.0F;
         float var66 = 0.0F;
         float var67 = 0.0F;
         float var68 = 0.0F;
         float var69 = 0.0F;
         float var70 = 0.0F;
         float var71 = 0.0F;
         float var72 = 0.0F;
         float var73 = 0.0F;
         if(var4 != var6) {
            float var74 = var4 - var6;
            var64 = (var7 - var9) / var74;
            var65 = (var10 - var12) / var74;
            var66 = (var13 - var15) / var74;
            var67 = (var16 - var18) / var74;
            var68 = (var19 - var21) / var74;
            var69 = (var26 - var28) / var74;
            var70 = (var32 - var34) / var74;
            var71 = (var35 - var37) / var74;
            var72 = (var38 - var40) / var74;
            var73 = (var41 - var43) / var74;
         }

         if(var4 < (float)anInt1726) {
            if(var5 > (float)anInt1726) {
               var5 = (float)anInt1726;
            }

            if(var6 > (float)anInt1726) {
               var6 = (float)anInt1726;
            }

            if(var5 < var6) {
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var21 = var19;
               var28 = var26;
               var34 = var32;
               var37 = var35;
               var40 = var38;
               var43 = var41;
               if(var4 < 0.0F) {
                  var7 -= var44 * var4;
                  var9 -= var64 * var4;
                  var10 -= var45 * var4;
                  var12 -= var65 * var4;
                  var13 -= var46 * var4;
                  var15 -= var66 * var4;
                  var16 -= var47 * var4;
                  var18 -= var67 * var4;
                  var19 -= var48 * var4;
                  var21 -= var68 * var4;
                  var26 -= var49 * var4;
                  var28 -= var69 * var4;
                  var32 -= var50 * var4;
                  var34 -= var70 * var4;
                  var35 -= var50 * var4;
                  var37 -= var70 * var4;
                  var38 -= var50 * var4;
                  var40 -= var70 * var4;
                  var41 -= var50 * var4;
                  var43 -= var70 * var4;
                  var4 = 0.0F;
               }

               if(var5 < 0.0F) {
                  var8 -= var54 * var5;
                  var11 -= var55 * var5;
                  var14 -= var56 * var5;
                  var17 -= var57 * var5;
                  var20 -= var58 * var5;
                  var27 -= var59 * var5;
                  var75 -= var60 * var5;
                  var36 -= var61 * var5;
                  var39 -= var62 * var5;
                  var42 -= var63 * var5;
                  var5 = 0.0F;
               }

               if((var4 == var5 || var64 >= var44) && (var4 != var5 || var64 <= var54)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var32, var34, var35, var37, var38, var40, var41, var43);
                     var7 += var44;
                     var9 += var64;
                     var10 += var45;
                     var12 += var65;
                     var13 += var46;
                     var15 += var66;
                     var16 += var47;
                     var18 += var67;
                     var19 += var48;
                     var21 += var68;
                     var26 += var49;
                     var28 += var69;
                     var32 += var50;
                     var34 += var70;
                     var35 += var51;
                     var37 += var71;
                     var38 += var52;
                     var40 += var72;
                     var41 += var53;
                     var43 += var73;
                  }

                  while(--var6 >= 0.0F) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var8, (int)var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var75, var34, var36, var37, var39, var40, var42, var43);
                     var8 += var54;
                     var9 += var64;
                     var11 += var55;
                     var12 += var65;
                     var14 += var56;
                     var15 += var66;
                     var17 += var57;
                     var18 += var67;
                     var20 += var58;
                     var21 += var68;
                     var27 += var59;
                     var28 += var69;
                     var75 += var60;
                     var34 += var70;
                     var36 += var61;
                     var37 += var71;
                     var39 += var62;
                     var40 += var72;
                     var42 += var63;
                     var43 += var73;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var34, var32, var37, var35, var40, var38, var43, var41);
                     var7 += var44;
                     var9 += var64;
                     var10 += var45;
                     var12 += var65;
                     var13 += var46;
                     var15 += var66;
                     var16 += var47;
                     var18 += var67;
                     var19 += var48;
                     var21 += var68;
                     var26 += var49;
                     var28 += var69;
                     var32 += var50;
                     var34 += var70;
                     var35 += var51;
                     var37 += var71;
                     var38 += var52;
                     var40 += var72;
                     var41 += var53;
                     var43 += var73;
                  }

                  while(--var6 >= 0.0F) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var9, (int)var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var34, var75, var37, var36, var40, var39, var43, var42);
                     var8 += var54;
                     var9 += var64;
                     var11 += var55;
                     var12 += var65;
                     var14 += var56;
                     var15 += var66;
                     var17 += var57;
                     var18 += var67;
                     var20 += var58;
                     var21 += var68;
                     var27 += var59;
                     var28 += var69;
                     var75 += var60;
                     var34 += var70;
                     var36 += var61;
                     var37 += var71;
                     var39 += var62;
                     var40 += var72;
                     var42 += var63;
                     var43 += var73;
                     var4 += (float)anInt1737;
                  }
               }
            } else {
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var20 = var19;
               var27 = var26;
               var75 = var32;
               var36 = var35;
               var39 = var38;
               var42 = var41;
               if(var4 < 0.0F) {
                  var7 -= var44 * var4;
                  var8 -= var64 * var4;
                  var10 -= var45 * var4;
                  var11 -= var65 * var4;
                  var13 -= var46 * var4;
                  var14 -= var66 * var4;
                  var16 -= var47 * var4;
                  var17 -= var67 * var4;
                  var19 -= var48 * var4;
                  var20 -= var68 * var4;
                  var26 -= var49 * var4;
                  var27 -= var69 * var4;
                  var32 -= var50 * var4;
                  var75 -= var70 * var4;
                  var35 -= var50 * var4;
                  var36 -= var70 * var4;
                  var38 -= var50 * var4;
                  var39 -= var70 * var4;
                  var41 -= var50 * var4;
                  var42 -= var70 * var4;
                  var4 = 0.0F;
               }

               if(var6 < 0.0F) {
                  var9 -= var54 * var6;
                  var12 -= var55 * var6;
                  var15 -= var56 * var6;
                  var18 -= var57 * var6;
                  var21 -= var58 * var6;
                  var28 -= var59 * var6;
                  var34 -= var60 * var6;
                  var37 -= var61 * var6;
                  var40 -= var62 * var6;
                  var43 -= var63 * var6;
                  var6 = 0.0F;
               }

               if((var4 == var6 || var64 >= var44) && (var4 != var6 || var54 <= var44)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var7, (int)var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var32, var75, var35, var36, var38, var39, var41, var42);
                     var8 += var64;
                     var7 += var44;
                     var11 += var65;
                     var10 += var45;
                     var14 += var66;
                     var13 += var46;
                     var17 += var67;
                     var16 += var47;
                     var20 += var68;
                     var19 += var48;
                     var27 += var69;
                     var26 += var49;
                     var75 += var70;
                     var32 += var50;
                     var36 += var71;
                     var35 += var51;
                     var39 += var72;
                     var38 += var52;
                     var42 += var73;
                     var41 += var53;
                  }

                  while(--var5 >= 0.0F) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var32, var34, var35, var37, var38, var40, var41, var43);
                     var7 += var44;
                     var9 += var54;
                     var10 += var45;
                     var12 += var55;
                     var13 += var46;
                     var15 += var56;
                     var16 += var47;
                     var18 += var57;
                     var19 += var48;
                     var21 += var58;
                     var26 += var49;
                     var28 += var59;
                     var32 += var50;
                     var34 += var60;
                     var35 += var51;
                     var37 += var61;
                     var38 += var52;
                     var40 += var62;
                     var41 += var53;
                     var43 += var63;
                     var4 += (float)anInt1737;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var8, (int)var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var75, var32, var36, var35, var39, var38, var42, var41);
                     var7 += var44;
                     var8 += var64;
                     var10 += var45;
                     var11 += var65;
                     var13 += var46;
                     var14 += var66;
                     var16 += var47;
                     var17 += var67;
                     var19 += var48;
                     var20 += var68;
                     var26 += var49;
                     var27 += var69;
                     var32 += var50;
                     var75 += var70;
                     var35 += var51;
                     var36 += var71;
                     var38 += var52;
                     var39 += var72;
                     var41 += var53;
                     var42 += var73;
                  }

                  while(--var5 >= 0.0F) {
                     method3353(var2, var3, anIntArray1751, anIntArray1725, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var34, var32, var37, var35, var40, var38, var43, var41);
                     var9 += var54;
                     var7 += var44;
                     var12 += var55;
                     var10 += var45;
                     var15 += var56;
                     var13 += var46;
                     var18 += var57;
                     var16 += var47;
                     var21 += var58;
                     var19 += var48;
                     var28 += var59;
                     var26 += var49;
                     var34 += var60;
                     var32 += var50;
                     var37 += var61;
                     var35 += var51;
                     var40 += var62;
                     var38 += var52;
                     var43 += var63;
                     var41 += var53;
                     var4 += (float)anInt1737;
                  }
               }
            }

         }
      }
   }

   final void method3385(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13, int var14, int var15) {
      if(!var1) {
         method3377(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else if(aBool1724) {
         aClass103_Sub2_1743.method2517((int)var7, (int)var4, (int)var8, (int)var5, -16777216 | var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var8, (int)var5, (int)var9, (int)var6, -16777216 | var13, 223909001);
         aClass103_Sub2_1743.method2517((int)var9, (int)var6, (int)var7, (int)var4, -16777216 | var13, 223909001);
      } else {
         float var16 = var8 - var7;
         float var17 = var5 - var4;
         float var18 = var9 - var7;
         float var19 = var6 - var4;
         float var20 = var11 - var10;
         float var21 = var12 - var10;
         float var22 = (float)((var14 & 16711680) - (var13 & 16711680));
         float var23 = (float)((var15 & 16711680) - (var13 & 16711680));
         float var24 = (float)((var14 & '\uff00') - (var13 & '\uff00'));
         float var25 = (float)((var15 & '\uff00') - (var13 & '\uff00'));
         float var26 = (float)((var14 & 255) - (var13 & 255));
         float var27 = (float)((var15 & 255) - (var13 & 255));
         float var28;
         if(var6 != var5) {
            var28 = (var9 - var8) / (var6 - var5);
         } else {
            var28 = 0.0F;
         }

         float var29;
         if(var5 != var4) {
            var29 = var16 / var17;
         } else {
            var29 = 0.0F;
         }

         float var30;
         if(var6 != var4) {
            var30 = var18 / var19;
         } else {
            var30 = 0.0F;
         }

         float var31 = var16 * var19 - var18 * var17;
         if(var31 != 0.0F) {
            float var32 = (var20 * var19 - var21 * var17) / var31;
            float var33 = (var21 * var16 - var20 * var18) / var31;
            float var34 = (var22 * var19 - var23 * var17) / var31;
            float var35 = (var23 * var16 - var22 * var18) / var31;
            float var36 = (var24 * var19 - var25 * var17) / var31;
            float var37 = (var25 * var16 - var24 * var18) / var31;
            float var38 = (var26 * var19 - var27 * var17) / var31;
            float var39 = (var27 * var16 - var26 * var18) / var31;
            float var42;
            float var40;
            float var41;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)anInt1726) {
                  if(var5 > (float)anInt1726) {
                     var5 = (float)anInt1726;
                  }

                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  var10 = var10 - var32 * var7 + var32;
                  var40 = (float)(var13 & 16711680) - var34 * var7 + var34;
                  var41 = (float)(var13 & '\uff00') - var36 * var7 + var36;
                  var42 = (float)(var13 & 255) - var38 * var7 + var38;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var28 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var30 >= var29) && (var4 != var5 || var30 <= var28)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var5 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var28 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var30 >= var29) && (var4 != var6 || var28 <= var29)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)anIntArray1730[(int)var4]; --var6 >= 0.0F; var4 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var8, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)anInt1726) {
                  if(var6 > (float)anInt1726) {
                     var6 = (float)anInt1726;
                  }

                  if(var4 > (float)anInt1726) {
                     var4 = (float)anInt1726;
                  }

                  var11 = var11 - var32 * var8 + var32;
                  var40 = (float)(var14 & 16711680) - var34 * var8 + var34;
                  var41 = (float)(var14 & '\uff00') - var36 * var8 + var36;
                  var42 = (float)(var14 & 255) - var38 * var8 + var38;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var30 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var29 >= var28) && (var5 != var6 || var29 <= var30)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var6 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var30 * var4;
                        var4 = 0.0F;
                     }

                     if(var29 < var28) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var9, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)anIntArray1730[(int)var5]; --var4 >= 0.0F; var5 += (float)anInt1737) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           method3349(var2, var3, anIntArray1751, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)anInt1737;
                        }

                     }
                  }
               }
            } else if(var6 < (float)anInt1726) {
               if(var4 > (float)anInt1726) {
                  var4 = (float)anInt1726;
               }

               if(var5 > (float)anInt1726) {
                  var5 = (float)anInt1726;
               }

               var12 = var12 - var32 * var9 + var32;
               var40 = (float)(var15 & 16711680) - var34 * var9 + var34;
               var41 = (float)(var15 & '\uff00') - var36 * var9 + var36;
               var42 = (float)(var15 & 255) - var38 * var9 + var38;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var29 * var4;
                     var4 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var4 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var29 * var5;
                     var5 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var7, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)anIntArray1730[(int)var6]; --var5 >= 0.0F; var6 += (float)anInt1737) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        method3349(var2, var3, anIntArray1751, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)anInt1737;
                     }

                  }
               }
            }
         }
      }
   }
}