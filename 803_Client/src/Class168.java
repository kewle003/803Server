/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class168 implements Interface63
{
    public abstract int method3601();
    
    public abstract void method3602(int i, int i_0_, int i_1_, int i_2_);
    
    public final void method3603(int i, int i_3_, int i_4_, int i_5_) {
	method3618(i, i_3_, i_4_, i_5_, 1, -1, 1);
    }
    
    public abstract int method3604();
    
    final void method3605(float f, float f_6_, float f_7_, float f_8_,
			  float f_9_, float f_10_, Class135 class135, int i,
			  int i_11_) {
	method3647(f, f_6_, f_7_, f_8_, f_9_, f_10_, 1, class135, i, i_11_);
    }
    
    public abstract int method3606();
    
    public abstract void method3607(int i, int i_12_, Class135 class135,
				    int i_13_, int i_14_);
    
    public abstract Interface4 method3608();
    
    public final void method3609(int i, int i_15_, int i_16_, int i_17_) {
	method3618(i, i_15_, i_16_, i_17_, 1, -1, 1);
    }
    
    public abstract void method3610(int i, int i_18_, int i_19_);
    
    abstract void method3611(float f, float f_20_, float f_21_, float f_22_,
			     float f_23_, float f_24_, int i, int i_25_,
			     int i_26_, int i_27_);
    
    public abstract void method3612(int[] is);
    
    public abstract void method3613(int i, int i_28_, int i_29_, int i_30_,
				    int i_31_, int i_32_, int i_33_);
    
    public final void method3614(int i, int i_34_, int i_35_, int i_36_) {
	method3670(i, i_34_, i_35_, i_36_, 1, -1, 1, 1);
    }
    
    public final void method3615(int i, int i_37_, int i_38_, int i_39_,
				 int i_40_, int i_41_, int i_42_) {
	method3670(i, i_37_, i_38_, i_39_, i_40_, i_41_, i_42_, 1);
    }
    
    public abstract int method3616();
    
    public final void method3617(float f, float f_43_, int i, int i_44_,
				 int i_45_, int i_46_, int i_47_) {
	method3623(f, f_43_, (float) method64() / 2.0F,
		   (float) method3616() / 2.0F, i, i_44_, i_45_, i_46_, i_47_);
    }
    
    public abstract void method3618(int i, int i_48_, int i_49_, int i_50_,
				    int i_51_, int i_52_, int i_53_);
    
    public final void method3619(float f, float f_54_, float f_55_,
				 float f_56_, int i, int i_57_) {
	method3623(f, f_54_, f_55_, f_56_, i, i_57_, 1, -1, 1);
    }
    
    public final void method3620(float f, float f_58_, int i, int i_59_) {
	method3623(f, f_58_, (float) method64() / 2.0F,
		   (float) method3616() / 2.0F, i, i_59_, 1, -1, 1);
    }
    
    public final void method3621(float f, float f_60_, int i, int i_61_,
				 int i_62_, int i_63_, int i_64_) {
	method3623(f, f_60_, (float) method64() / 2.0F,
		   (float) method3616() / 2.0F, i, i_61_, i_62_, i_63_, i_64_);
    }
    
    public final void method3622(float f, float f_65_, float f_66_,
				 float f_67_, int i, int i_68_, int i_69_,
				 int i_70_, int i_71_, int i_72_) {
	if (i != 0 && i_68_ != 0) {
	    double d = (double) (i_69_ & 0xffff) * 9.587379924285257E-5;
	    float f_73_ = (float) Math.sin(d) * (float) i_68_;
	    float f_74_ = (float) Math.cos(d) * (float) i_68_;
	    float f_75_ = (float) Math.sin(d) * (float) i;
	    float f_76_ = (float) Math.cos(d) * (float) i;
	    float f_77_ = (-f_66_ * f_76_ + -f_67_ * f_73_) / 4096.0F + f;
	    float f_78_ = (--f_66_ * f_75_ + -f_67_ * f_74_) / 4096.0F + f_65_;
	    float f_79_ = ((((float) method64() - f_66_) * f_76_
			    + -f_67_ * f_73_) / 4096.0F
			   + f);
	    float f_80_ = ((-((float) method64() - f_66_) * f_75_
			    + -f_67_ * f_74_) / 4096.0F
			   + f_65_);
	    float f_81_ = ((-f_66_ * f_76_
			    + ((float) method3616() - f_67_) * f_73_) / 4096.0F
			   + f);
	    float f_82_ = ((--f_66_ * f_75_
			    + ((float) method3616() - f_67_) * f_74_) / 4096.0F
			   + f_65_);
	    method3626(f_77_, f_78_, f_79_, f_80_, f_81_, f_82_, i_70_, i_71_,
		       i_72_);
	}
    }
    
    public final void method3623(float f, float f_83_, float f_84_,
				 float f_85_, int i, int i_86_, int i_87_,
				 int i_88_, int i_89_) {
	if (i != 0) {
	    double d = (double) (i_86_ & 0xffff) * 9.587379924285257E-5;
	    float f_90_ = (float) Math.sin(d) * (float) i;
	    float f_91_ = (float) Math.cos(d) * (float) i;
	    float f_92_ = (-f_84_ * f_91_ + -f_85_ * f_90_) / 4096.0F + f;
	    float f_93_ = (--f_84_ * f_90_ + -f_85_ * f_91_) / 4096.0F + f_83_;
	    float f_94_ = ((((float) method64() - f_84_) * f_91_
			    + -f_85_ * f_90_) / 4096.0F
			   + f);
	    float f_95_ = ((-((float) method64() - f_84_) * f_90_
			    + -f_85_ * f_91_) / 4096.0F
			   + f_83_);
	    float f_96_ = ((-f_84_ * f_91_
			    + ((float) method3616() - f_85_) * f_90_) / 4096.0F
			   + f);
	    float f_97_ = ((--f_84_ * f_90_
			    + ((float) method3616() - f_85_) * f_91_) / 4096.0F
			   + f_83_);
	    method3626(f_92_, f_93_, f_94_, f_95_, f_96_, f_97_, i_87_, i_88_,
		       i_89_);
	}
    }
    
    public final void method3624(int i, int i_98_, int i_99_, int i_100_) {
	method3670(i, i_98_, i_99_, i_100_, 1, -1, 1, 1);
    }
    
    public final void method3625(float f, float f_101_, float f_102_,
				 float f_103_, int i, int i_104_,
				 Class135 class135, int i_105_, int i_106_) {
	if (i != 0) {
	    double d = (double) (i_104_ & 0xffff) * 9.587379924285257E-5;
	    float f_107_ = (float) Math.sin(d) * (float) i;
	    float f_108_ = (float) Math.cos(d) * (float) i;
	    float f_109_ = (-f_102_ * f_108_ + -f_103_ * f_107_) / 4096.0F + f;
	    float f_110_
		= (--f_102_ * f_107_ + -f_103_ * f_108_) / 4096.0F + f_101_;
	    float f_111_ = ((((float) method64() - f_102_) * f_108_
			     + -f_103_ * f_107_) / 4096.0F
			    + f);
	    float f_112_ = ((-((float) method64() - f_102_) * f_107_
			     + -f_103_ * f_108_) / 4096.0F
			    + f_101_);
	    float f_113_
		= ((-f_102_ * f_108_
		    + ((float) method3616() - f_103_) * f_107_) / 4096.0F
		   + f);
	    float f_114_
		= ((--f_102_ * f_107_
		    + ((float) method3616() - f_103_) * f_108_) / 4096.0F
		   + f_101_);
	    method3628(f_109_, f_110_, f_111_, f_112_, f_113_, f_114_,
		       class135, i_105_, i_106_);
	}
    }
    
    public final void method3626(float f, float f_115_, float f_116_,
				 float f_117_, float f_118_, float f_119_,
				 int i, int i_120_, int i_121_) {
	method3627(f, f_115_, f_116_, f_117_, f_118_, f_119_, i, i_120_,
		   i_121_, 1);
    }
    
    abstract void method3627(float f, float f_122_, float f_123_, float f_124_,
			     float f_125_, float f_126_, int i, int i_127_,
			     int i_128_, int i_129_);
    
    final void method3628(float f, float f_130_, float f_131_, float f_132_,
			  float f_133_, float f_134_, Class135 class135, int i,
			  int i_135_) {
	method3647(f, f_130_, f_131_, f_132_, f_133_, f_134_, 1, class135, i,
		   i_135_);
    }
    
    public final void method3629(int i, int i_136_, int i_137_, int i_138_) {
	method3670(i, i_136_, i_137_, i_138_, 1, -1, 1, 1);
    }
    
    Class168() {
	/* empty */
    }
    
    public abstract void method3630(int i, int i_139_, int i_140_);
    
    public abstract int method3631();
    
    public final void method3632(float f, float f_141_, int i, int i_142_,
				 Class135 class135, int i_143_, int i_144_) {
	method3625(f, f_141_, (float) method64() / 2.0F,
		   (float) method3616() / 2.0F, i, i_142_, class135, i_143_,
		   i_144_);
    }
    
    public abstract Interface4 method3633();
    
    public abstract int method64();
    
    public abstract Interface4 method3634();
    
    public abstract void method3635(int i, int i_145_, int i_146_, int i_147_,
				    int i_148_);
    
    public abstract Interface4 method3636();
    
    public abstract void method3637(int i, int i_149_, Class135 class135,
				    int i_150_, int i_151_);
    
    public abstract void method3638(int i, int i_152_, Class135 class135,
				    int i_153_, int i_154_);
    
    public abstract void method3639(int i, int i_155_, int i_156_, int i_157_,
				    int i_158_, int i_159_);
    
    abstract void method3640(int i, int i_160_, int i_161_, int i_162_,
			     int i_163_, int i_164_, int i_165_, int i_166_);
    
    abstract void method3641(int i, int i_167_, int i_168_, int i_169_,
			     int i_170_, int i_171_, int i_172_, int i_173_);
    
    public abstract int method3642();
    
    public abstract void method3643(int[] is);
    
    public abstract int method397();
    
    public final void method3644(float f, float f_174_, float f_175_,
				 float f_176_, int i, int i_177_, int i_178_,
				 int i_179_, int i_180_) {
	if (i != 0) {
	    double d = (double) (i_177_ & 0xffff) * 9.587379924285257E-5;
	    float f_181_ = (float) Math.sin(d) * (float) i;
	    float f_182_ = (float) Math.cos(d) * (float) i;
	    float f_183_ = (-f_175_ * f_182_ + -f_176_ * f_181_) / 4096.0F + f;
	    float f_184_
		= (--f_175_ * f_181_ + -f_176_ * f_182_) / 4096.0F + f_174_;
	    float f_185_ = ((((float) method64() - f_175_) * f_182_
			     + -f_176_ * f_181_) / 4096.0F
			    + f);
	    float f_186_ = ((-((float) method64() - f_175_) * f_181_
			     + -f_176_ * f_182_) / 4096.0F
			    + f_174_);
	    float f_187_
		= ((-f_175_ * f_182_
		    + ((float) method3616() - f_176_) * f_181_) / 4096.0F
		   + f);
	    float f_188_
		= ((--f_175_ * f_181_
		    + ((float) method3616() - f_176_) * f_182_) / 4096.0F
		   + f_174_);
	    method3626(f_183_, f_184_, f_185_, f_186_, f_187_, f_188_, i_178_,
		       i_179_, i_180_);
	}
    }
    
    public abstract int method445();
    
    public abstract int method3645();
    
    public final void method3646(int i, int i_189_) {
	method3666(i, i_189_, 1, -1, 1);
    }
    
    abstract void method3647(float f, float f_190_, float f_191_, float f_192_,
			     float f_193_, float f_194_, int i,
			     Class135 class135, int i_195_, int i_196_);
    
    abstract void method3648(float f, float f_197_, float f_198_, float f_199_,
			     float f_200_, float f_201_, int i, int i_202_,
			     int i_203_, int i_204_);
    
    abstract void method3649(float f, float f_205_, float f_206_, float f_207_,
			     float f_208_, float f_209_, int i,
			     Class135 class135, int i_210_, int i_211_);
    
    abstract void method3650(float f, float f_212_, float f_213_, float f_214_,
			     float f_215_, float f_216_, int i,
			     Class135 class135, int i_217_, int i_218_);
    
    abstract void method3651(float f, float f_219_, float f_220_, float f_221_,
			     float f_222_, float f_223_, int i,
			     Class135 class135, int i_224_, int i_225_);
    
    public abstract int method3652();
    
    public abstract void method3653(int i, int i_226_, int i_227_);
    
    public abstract Interface4 method3654();
    
    public abstract int method3655();
    
    public abstract void method3656(int i, int i_228_, int i_229_, int i_230_);
    
    public abstract int method3657();
    
    public abstract void method3658(int i, int i_231_, int i_232_, int i_233_,
				    int i_234_);
    
    public final void method3659(int i, int i_235_) {
	method3666(i, i_235_, 1, -1, 1);
    }
    
    public final void method3660(int i, int i_236_) {
	method3666(i, i_236_, 1, -1, 1);
    }
    
    public final void method3661(int i, int i_237_, int i_238_, int i_239_) {
	method3670(i, i_237_, i_238_, i_239_, 1, -1, 1, 1);
    }
    
    public final void method3662(int i, int i_240_, int i_241_, int i_242_) {
	method3670(i, i_240_, i_241_, i_242_, 1, -1, 1, 1);
    }
    
    public final void method3663(float f, float f_243_, int i, int i_244_,
				 Class135 class135, int i_245_, int i_246_) {
	method3625(f, f_243_, (float) method64() / 2.0F,
		   (float) method3616() / 2.0F, i, i_244_, class135, i_245_,
		   i_246_);
    }
    
    public abstract int method444();
    
    public final void method3664(int i, int i_247_, int i_248_, int i_249_,
				 int i_250_, int i_251_, int i_252_) {
	method3670(i, i_247_, i_248_, i_249_, i_250_, i_251_, i_252_, 1);
    }
    
    public final void method3665(int i, int i_253_, int i_254_, int i_255_) {
	method3618(i, i_253_, i_254_, i_255_, 1, -1, 1);
    }
    
    public abstract void method3666(int i, int i_256_, int i_257_, int i_258_,
				    int i_259_);
    
    public final void method3667(float f, float f_260_, float f_261_,
				 float f_262_, int i, int i_263_) {
	method3623(f, f_260_, f_261_, f_262_, i, i_263_, 1, -1, 1);
    }
    
    public final void method3668(float f, float f_264_, int i, int i_265_) {
	method3623(f, f_264_, (float) method64() / 2.0F,
		   (float) method3616() / 2.0F, i, i_265_, 1, -1, 1);
    }
    
    public final void method3669(float f, float f_266_, int i, int i_267_,
				 int i_268_, int i_269_, int i_270_) {
	method3623(f, f_266_, (float) method64() / 2.0F,
		   (float) method3616() / 2.0F, i, i_267_, i_268_, i_269_,
		   i_270_);
    }
    
    abstract void method3670(int i, int i_271_, int i_272_, int i_273_,
			     int i_274_, int i_275_, int i_276_, int i_277_);
    
    public final void method3671(float f, float f_278_, float f_279_,
				 float f_280_, int i, int i_281_, int i_282_,
				 int i_283_, int i_284_, int i_285_) {
	if (i != 0 && i_281_ != 0) {
	    double d = (double) (i_282_ & 0xffff) * 9.587379924285257E-5;
	    float f_286_ = (float) Math.sin(d) * (float) i_281_;
	    float f_287_ = (float) Math.cos(d) * (float) i_281_;
	    float f_288_ = (float) Math.sin(d) * (float) i;
	    float f_289_ = (float) Math.cos(d) * (float) i;
	    float f_290_ = (-f_279_ * f_289_ + -f_280_ * f_286_) / 4096.0F + f;
	    float f_291_
		= (--f_279_ * f_288_ + -f_280_ * f_287_) / 4096.0F + f_278_;
	    float f_292_ = ((((float) method64() - f_279_) * f_289_
			     + -f_280_ * f_286_) / 4096.0F
			    + f);
	    float f_293_ = ((-((float) method64() - f_279_) * f_288_
			     + -f_280_ * f_287_) / 4096.0F
			    + f_278_);
	    float f_294_
		= ((-f_279_ * f_289_
		    + ((float) method3616() - f_280_) * f_286_) / 4096.0F
		   + f);
	    float f_295_
		= ((--f_279_ * f_288_
		    + ((float) method3616() - f_280_) * f_287_) / 4096.0F
		   + f_278_);
	    method3626(f_290_, f_291_, f_292_, f_293_, f_294_, f_295_, i_283_,
		       i_284_, i_285_);
	}
    }
    
    public final void method3672(float f, float f_296_, float f_297_,
				 float f_298_, int i, int i_299_, int i_300_,
				 int i_301_, int i_302_) {
	if (i != 0) {
	    double d = (double) (i_299_ & 0xffff) * 9.587379924285257E-5;
	    float f_303_ = (float) Math.sin(d) * (float) i;
	    float f_304_ = (float) Math.cos(d) * (float) i;
	    float f_305_ = (-f_297_ * f_304_ + -f_298_ * f_303_) / 4096.0F + f;
	    float f_306_
		= (--f_297_ * f_303_ + -f_298_ * f_304_) / 4096.0F + f_296_;
	    float f_307_ = ((((float) method64() - f_297_) * f_304_
			     + -f_298_ * f_303_) / 4096.0F
			    + f);
	    float f_308_ = ((-((float) method64() - f_297_) * f_303_
			     + -f_298_ * f_304_) / 4096.0F
			    + f_296_);
	    float f_309_
		= ((-f_297_ * f_304_
		    + ((float) method3616() - f_298_) * f_303_) / 4096.0F
		   + f);
	    float f_310_
		= ((--f_297_ * f_303_
		    + ((float) method3616() - f_298_) * f_304_) / 4096.0F
		   + f_296_);
	    method3626(f_305_, f_306_, f_307_, f_308_, f_309_, f_310_, i_300_,
		       i_301_, i_302_);
	}
    }
    
    public final void method3673(int i, int i_311_) {
	method3666(i, i_311_, 1, -1, 1);
    }
    
    public final void method3674(float f, float f_312_, float f_313_,
				 float f_314_, int i, int i_315_, int i_316_,
				 int i_317_, int i_318_) {
	if (i != 0) {
	    double d = (double) (i_315_ & 0xffff) * 9.587379924285257E-5;
	    float f_319_ = (float) Math.sin(d) * (float) i;
	    float f_320_ = (float) Math.cos(d) * (float) i;
	    float f_321_ = (-f_313_ * f_320_ + -f_314_ * f_319_) / 4096.0F + f;
	    float f_322_
		= (--f_313_ * f_319_ + -f_314_ * f_320_) / 4096.0F + f_312_;
	    float f_323_ = ((((float) method64() - f_313_) * f_320_
			     + -f_314_ * f_319_) / 4096.0F
			    + f);
	    float f_324_ = ((-((float) method64() - f_313_) * f_319_
			     + -f_314_ * f_320_) / 4096.0F
			    + f_312_);
	    float f_325_
		= ((-f_313_ * f_320_
		    + ((float) method3616() - f_314_) * f_319_) / 4096.0F
		   + f);
	    float f_326_
		= ((--f_313_ * f_319_
		    + ((float) method3616() - f_314_) * f_320_) / 4096.0F
		   + f_312_);
	    method3626(f_321_, f_322_, f_323_, f_324_, f_325_, f_326_, i_316_,
		       i_317_, i_318_);
	}
    }
    
    public abstract void method3675(int i, int i_327_, int i_328_, int i_329_,
				    int i_330_, int i_331_);
    
    public final void method3676(float f, float f_332_, int i, int i_333_,
				 Class135 class135, int i_334_, int i_335_) {
	method3625(f, f_332_, (float) method64() / 2.0F,
		   (float) method3616() / 2.0F, i, i_333_, class135, i_334_,
		   i_335_);
    }
    
    public final void method3677(float f, float f_336_, float f_337_,
				 float f_338_, int i, int i_339_,
				 Class135 class135, int i_340_, int i_341_) {
	if (i != 0) {
	    double d = (double) (i_339_ & 0xffff) * 9.587379924285257E-5;
	    float f_342_ = (float) Math.sin(d) * (float) i;
	    float f_343_ = (float) Math.cos(d) * (float) i;
	    float f_344_ = (-f_337_ * f_343_ + -f_338_ * f_342_) / 4096.0F + f;
	    float f_345_
		= (--f_337_ * f_342_ + -f_338_ * f_343_) / 4096.0F + f_336_;
	    float f_346_ = ((((float) method64() - f_337_) * f_343_
			     + -f_338_ * f_342_) / 4096.0F
			    + f);
	    float f_347_ = ((-((float) method64() - f_337_) * f_342_
			     + -f_338_ * f_343_) / 4096.0F
			    + f_336_);
	    float f_348_
		= ((-f_337_ * f_343_
		    + ((float) method3616() - f_338_) * f_342_) / 4096.0F
		   + f);
	    float f_349_
		= ((--f_337_ * f_342_
		    + ((float) method3616() - f_338_) * f_343_) / 4096.0F
		   + f_336_);
	    method3628(f_344_, f_345_, f_346_, f_347_, f_348_, f_349_,
		       class135, i_340_, i_341_);
	}
    }
    
    final void method3678(float f, float f_350_, float f_351_, float f_352_,
			  float f_353_, float f_354_, Class135 class135, int i,
			  int i_355_) {
	method3647(f, f_350_, f_351_, f_352_, f_353_, f_354_, 1, class135, i,
		   i_355_);
    }
    
    public abstract void method3679(int i, int i_356_, Class135 class135,
				    int i_357_, int i_358_);
}
