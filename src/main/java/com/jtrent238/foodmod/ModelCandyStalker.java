package com.jtrent238.foodmod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

//This Was The First Model I Made With Techne So Please don't Be Angry//

public class ModelCandyStalker extends ModelBase
{
  //fields
    ModelRenderer Piece1;
    ModelRenderer HeadLeft;
    ModelRenderer HeadRight;
    ModelRenderer Piece2;
    ModelRenderer Feet;
  
  public ModelCandyStalker(int elec_candyland)
  {
    textureWidth = 64;
    textureHeight = 32;
    setTextureOffset("Piece2.Body", 0, 0);
    setTextureOffset("Feet.Foot1", 0, 0);
    setTextureOffset("Feet.Foot2", 0, 0);
    setTextureOffset("Feet.Foot3", 0, 0);
    setTextureOffset("Feet.Foot4", 0, 0);
    
    Piece1 = new ModelRenderer(this, "Piece1");
    Piece1.setRotationPoint(0F, 0F, 0F);
    setRotation(Piece1, 0F, 0F, 0F);
    Piece1.mirror = true;
      HeadLeft = new ModelRenderer(this, 0, 0);
      HeadLeft.addBox(-9F, 0F, 0F, 5, 5, 5);
      HeadLeft.setRotationPoint(0F, 0F, 0F);
      HeadLeft.setTextureSize(64, 32);
      HeadLeft.mirror = true;
      setRotation(HeadLeft, 0F, 0F, 0F);
      HeadRight = new ModelRenderer(this, 0, 0);
      HeadRight.addBox(0F, 0F, 0F, 5, 5, 5);
      HeadRight.setRotationPoint(0F, 0F, 0F);
      HeadRight.setTextureSize(64, 32);
      HeadRight.mirror = true;
      setRotation(HeadRight, 0F, 0F, 0F);
    Piece2 = new ModelRenderer(this, "Piece2");
    Piece2.setRotationPoint(-4F, 5F, 0F);
    setRotation(Piece2, 0F, 0F, 0F);
    Piece2.mirror = true;
      Piece2.addBox("Body", 0F, 0F, 0F, 4, 15, 5);
    Feet = new ModelRenderer(this, "Feet");
    Feet.setRotationPoint(0F, 20F, 4F);
    setRotation(Feet, 0F, 0F, 0F);
    Feet.mirror = true;
      Feet.addBox("Foot1", 0F, 0F, -1F, 5, 4, 5);
      Feet.addBox("Foot2", 0F, 0F, -7F, 5, 4, 5);
      Feet.addBox("Foot3", -9F, 0F, -1F, 5, 4, 5);
      Feet.addBox("Foot4", -9F, 0F, -7F, 5, 4, 5);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Piece1.render(f5);
    HeadLeft.render(f5);
    HeadRight.render(f5);
    Piece2.render(f5);
    Feet.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
