/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSoftColliders extends BulletBase {
	private long swigCPtr;
	
	protected btSoftColliders(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSoftColliders, normally you should not need this constructor it's intended for low-level usage. */ 
	public btSoftColliders(long cPtr, boolean cMemoryOwn) {
		this("btSoftColliders", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btSoftColliders obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				SoftbodyJNI.delete_btSoftColliders(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  static public class ClusterBase extends btDbvt.ICollide {
  	private long swigCPtr;
  	
  	protected ClusterBase(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, SoftbodyJNI.btSoftColliders_ClusterBase_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new ClusterBase, normally you should not need this constructor it's intended for low-level usage. */
  	public ClusterBase(long cPtr, boolean cMemoryOwn) {
  		this("ClusterBase", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(SoftbodyJNI.btSoftColliders_ClusterBase_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(ClusterBase obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				SoftbodyJNI.delete_btSoftColliders_ClusterBase(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setErp(float value) {
      SoftbodyJNI.btSoftColliders_ClusterBase_erp_set(swigCPtr, this, value);
    }
  
    public float getErp() {
      return SoftbodyJNI.btSoftColliders_ClusterBase_erp_get(swigCPtr, this);
    }
  
    public void setIdt(float value) {
      SoftbodyJNI.btSoftColliders_ClusterBase_idt_set(swigCPtr, this, value);
    }
  
    public float getIdt() {
      return SoftbodyJNI.btSoftColliders_ClusterBase_idt_get(swigCPtr, this);
    }
  
    public void setMargin(float value) {
      SoftbodyJNI.btSoftColliders_ClusterBase_margin_set(swigCPtr, this, value);
    }
  
    public float getMargin() {
      return SoftbodyJNI.btSoftColliders_ClusterBase_margin_get(swigCPtr, this);
    }
  
    public void setFriction(float value) {
      SoftbodyJNI.btSoftColliders_ClusterBase_friction_set(swigCPtr, this, value);
    }
  
    public float getFriction() {
      return SoftbodyJNI.btSoftColliders_ClusterBase_friction_get(swigCPtr, this);
    }
  
    public void setThreshold(float value) {
      SoftbodyJNI.btSoftColliders_ClusterBase_threshold_set(swigCPtr, this, value);
    }
  
    public float getThreshold() {
      return SoftbodyJNI.btSoftColliders_ClusterBase_threshold_get(swigCPtr, this);
    }
  
    public ClusterBase() {
      this(SoftbodyJNI.new_btSoftColliders_ClusterBase(), true);
    }
  
    public boolean SolveContact(btGjkEpaSolver2.sResults res, btSoftBody.Body ba, btSoftBody.Body bb, btSoftBody.CJoint joint) {
      return SoftbodyJNI.btSoftColliders_ClusterBase_SolveContact(swigCPtr, this, btGjkEpaSolver2.sResults.getCPtr(res), res, btSoftBody.Body.getCPtr(ba), ba, btSoftBody.Body.getCPtr(bb), bb, btSoftBody.CJoint.getCPtr(joint), joint);
    }
  
  }

  static public class CollideCL_RS extends btSoftColliders.ClusterBase {
  	private long swigCPtr;
  	
  	protected CollideCL_RS(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, SoftbodyJNI.btSoftColliders_CollideCL_RS_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new CollideCL_RS, normally you should not need this constructor it's intended for low-level usage. */
  	public CollideCL_RS(long cPtr, boolean cMemoryOwn) {
  		this("CollideCL_RS", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(SoftbodyJNI.btSoftColliders_CollideCL_RS_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(CollideCL_RS obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				SoftbodyJNI.delete_btSoftColliders_CollideCL_RS(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setPsb(btSoftBody value) {
      SoftbodyJNI.btSoftColliders_CollideCL_RS_psb_set(swigCPtr, this, btSoftBody.getCPtr(value), value);
    }
  
    public btSoftBody getPsb() {
      long cPtr = SoftbodyJNI.btSoftColliders_CollideCL_RS_psb_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
    }
  
    public void setColObjWrap(btCollisionObjectWrapper value) {
      SoftbodyJNI.btSoftColliders_CollideCL_RS_colObjWrap_set(swigCPtr, this, btCollisionObjectWrapper.getCPtr(value), value);
    }
  
    public btCollisionObjectWrapper getColObjWrap() {
  	return btCollisionObjectWrapper.internalTemp(SoftbodyJNI.btSoftColliders_CollideCL_RS_colObjWrap_get(swigCPtr, this), false);
  }
  
    public void ProcessColObj(btSoftBody ps, btCollisionObjectWrapper colObWrap) {
      SoftbodyJNI.btSoftColliders_CollideCL_RS_ProcessColObj(swigCPtr, this, btSoftBody.getCPtr(ps), ps, btCollisionObjectWrapper.getCPtr(colObWrap), colObWrap);
    }
  
    public CollideCL_RS() {
      this(SoftbodyJNI.new_btSoftColliders_CollideCL_RS(), true);
    }
  
  }

  static public class CollideCL_SS extends btSoftColliders.ClusterBase {
  	private long swigCPtr;
  	
  	protected CollideCL_SS(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, SoftbodyJNI.btSoftColliders_CollideCL_SS_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new CollideCL_SS, normally you should not need this constructor it's intended for low-level usage. */
  	public CollideCL_SS(long cPtr, boolean cMemoryOwn) {
  		this("CollideCL_SS", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(SoftbodyJNI.btSoftColliders_CollideCL_SS_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(CollideCL_SS obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				SoftbodyJNI.delete_btSoftColliders_CollideCL_SS(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setBodies(SWIGTYPE_p_p_btSoftBody value) {
      SoftbodyJNI.btSoftColliders_CollideCL_SS_bodies_set(swigCPtr, this, SWIGTYPE_p_p_btSoftBody.getCPtr(value));
    }
  
    public SWIGTYPE_p_p_btSoftBody getBodies() {
      long cPtr = SoftbodyJNI.btSoftColliders_CollideCL_SS_bodies_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_p_btSoftBody(cPtr, false);
    }
  
    public void ProcessSoftSoft(btSoftBody psa, btSoftBody psb) {
      SoftbodyJNI.btSoftColliders_CollideCL_SS_ProcessSoftSoft(swigCPtr, this, btSoftBody.getCPtr(psa), psa, btSoftBody.getCPtr(psb), psb);
    }
  
    public CollideCL_SS() {
      this(SoftbodyJNI.new_btSoftColliders_CollideCL_SS(), true);
    }
  
  }

  static public class CollideSDF_RS extends btDbvt.ICollide {
  	private long swigCPtr;
  	
  	protected CollideSDF_RS(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, SoftbodyJNI.btSoftColliders_CollideSDF_RS_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new CollideSDF_RS, normally you should not need this constructor it's intended for low-level usage. */
  	public CollideSDF_RS(long cPtr, boolean cMemoryOwn) {
  		this("CollideSDF_RS", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(SoftbodyJNI.btSoftColliders_CollideSDF_RS_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(CollideSDF_RS obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				SoftbodyJNI.delete_btSoftColliders_CollideSDF_RS(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void DoNode(btSoftBody.Node n) {
      SoftbodyJNI.btSoftColliders_CollideSDF_RS_DoNode(swigCPtr, this, btSoftBody.Node.getCPtr(n), n);
    }
  
    public void setPsb(btSoftBody value) {
      SoftbodyJNI.btSoftColliders_CollideSDF_RS_psb_set(swigCPtr, this, btSoftBody.getCPtr(value), value);
    }
  
    public btSoftBody getPsb() {
      long cPtr = SoftbodyJNI.btSoftColliders_CollideSDF_RS_psb_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
    }
  
    public void setColObj1Wrap(btCollisionObjectWrapper value) {
      SoftbodyJNI.btSoftColliders_CollideSDF_RS_colObj1Wrap_set(swigCPtr, this, btCollisionObjectWrapper.getCPtr(value), value);
    }
  
    public btCollisionObjectWrapper getColObj1Wrap() {
  	return btCollisionObjectWrapper.internalTemp(SoftbodyJNI.btSoftColliders_CollideSDF_RS_colObj1Wrap_get(swigCPtr, this), false);
  }
  
    public void setRigidBody(btRigidBody value) {
      SoftbodyJNI.btSoftColliders_CollideSDF_RS_rigidBody_set(swigCPtr, this, btRigidBody.getCPtr(value), value);
    }
  
    public btRigidBody getRigidBody() {
  	return btRigidBody.getInstance(SoftbodyJNI.btSoftColliders_CollideSDF_RS_rigidBody_get(swigCPtr, this), false);
  }
  
    public void setDynmargin(float value) {
      SoftbodyJNI.btSoftColliders_CollideSDF_RS_dynmargin_set(swigCPtr, this, value);
    }
  
    public float getDynmargin() {
      return SoftbodyJNI.btSoftColliders_CollideSDF_RS_dynmargin_get(swigCPtr, this);
    }
  
    public void setStamargin(float value) {
      SoftbodyJNI.btSoftColliders_CollideSDF_RS_stamargin_set(swigCPtr, this, value);
    }
  
    public float getStamargin() {
      return SoftbodyJNI.btSoftColliders_CollideSDF_RS_stamargin_get(swigCPtr, this);
    }
  
    public CollideSDF_RS() {
      this(SoftbodyJNI.new_btSoftColliders_CollideSDF_RS(), true);
    }
  
  }

  static public class CollideVF_SS extends btDbvt.ICollide {
  	private long swigCPtr;
  	
  	protected CollideVF_SS(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, SoftbodyJNI.btSoftColliders_CollideVF_SS_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new CollideVF_SS, normally you should not need this constructor it's intended for low-level usage. */
  	public CollideVF_SS(long cPtr, boolean cMemoryOwn) {
  		this("CollideVF_SS", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(SoftbodyJNI.btSoftColliders_CollideVF_SS_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(CollideVF_SS obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				SoftbodyJNI.delete_btSoftColliders_CollideVF_SS(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setPsb(SWIGTYPE_p_p_btSoftBody value) {
      SoftbodyJNI.btSoftColliders_CollideVF_SS_psb_set(swigCPtr, this, SWIGTYPE_p_p_btSoftBody.getCPtr(value));
    }
  
    public SWIGTYPE_p_p_btSoftBody getPsb() {
      long cPtr = SoftbodyJNI.btSoftColliders_CollideVF_SS_psb_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_p_btSoftBody(cPtr, false);
    }
  
    public void setMrg(float value) {
      SoftbodyJNI.btSoftColliders_CollideVF_SS_mrg_set(swigCPtr, this, value);
    }
  
    public float getMrg() {
      return SoftbodyJNI.btSoftColliders_CollideVF_SS_mrg_get(swigCPtr, this);
    }
  
    public CollideVF_SS() {
      this(SoftbodyJNI.new_btSoftColliders_CollideVF_SS(), true);
    }
  
  }

  public btSoftColliders() {
    this(SoftbodyJNI.new_btSoftColliders(), true);
  }

}
