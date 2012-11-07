package spire.math

import java.lang.Math.pow

object UShort {
  @inline implicit final def apply(n: Char) = new UShort(n)
  @inline implicit final def apply(n: Int) = new UShort(n.toChar)

  @inline final def MinValue = UShort(0)
  @inline final def MaxValue = UShort(Char.MaxValue)
}

class UShort(val signed: Char) extends AnyVal {
  def toByte: Byte = signed.toByte
  def toChar: Char = signed
  def toShort: Short = signed.toShort
  def toInt: Int = signed.toInt
  def toLong: Long = signed.toLong
  def toFloat: Float = signed.toFloat
  def toDouble: Double = signed.toDouble

  def isValidByte = signed == toByte
  def isValidShort = signed == toShort
  def isValidChar = true
  def isValidInt = true
  def isValidLong = true

  override def toString: String = toInt.toString
  
  def == (that: Long): Boolean = this.signed == that.toShort
  def == (that: UShort): Boolean = this.signed == that.signed

  def != (that: Long): Boolean = this.signed != that.toShort
  def != (that: UShort): Boolean = this.signed != that.signed

  def <= (that: UShort) = this.signed <= that.signed
  def < (that: UShort) = this.signed < that.signed
  def >= (that: UShort) = this.signed >= that.signed
  def > (that: UShort) = this.signed > that.signed
  
  def unary_- (that: UShort) = UShort(this.signed)

  def + (that: UShort) = UShort(this.signed + that.signed)
  def - (that: UShort) = UShort(this.signed - that.signed)
  def * (that: UShort) = UShort(this.signed * that.signed)
  def / (that: UShort) = UShort(this.signed / that.signed)
  def % (that: UShort) = UShort(this.signed % that.signed)

  def unary_~ (that: UShort) = UShort(this.signed)

  def << (shift: UShort) = UShort(this.signed << shift.signed)
  def >> (shift: UShort) = UShort(this.signed >> shift.signed)
  def >>> (shift: UShort) = UShort(this.signed >>> shift.signed)
  def & (that: UShort) = UShort(this.signed & that.signed)
  def | (that: UShort) = UShort(this.signed | that.signed)
  def ^ (that: UShort) = UShort(this.signed ^ that.signed)

  def ** (that: UShort) = UShort(pow(this.toDouble, that.toDouble).toChar)
}
