package co.com.sofka

object InvoiceFunctions {

  def calcSubTotal(price: Double, quantity: Double): Double = quantity * price

  def calcIva(subTotal: Double, iva: Double): Double = subTotal * iva

  def calcTax(subTotal: Double, tax: Double): Double = subTotal * tax

  def calcTotal(subTotal: Double, iva: Double, tax: Double): Double = subTotal + iva + tax

  def createInvoice(
                     productName: String,
                     price: Double,
                     quantity: Double,
                     iva: Double,
                     tax: Double
                   ): Unit = {
    val subTotal: Double = calcSubTotal(price, quantity)
    val ivaTotal: Double =  calcIva(subTotal, iva)
    val taxTotal: Double =  calcTax(subTotal, tax)
    val total: Double = calcTotal(subTotal, ivaTotal, taxTotal)

    printInvoice(productName, subTotal, ivaTotal, taxTotal, total)
  }

  def printInvoice(productName: String, subTotal: Double, iva: Double, tax: Double, total: Double): Unit = {
    println("Product: " + productName)
    println("SubTotal: " + subTotal)
    println("IVA: " + iva)
    println("Tax: " + tax)
    println("Total: " + total)
  }

}
