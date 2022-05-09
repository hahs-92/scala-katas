package co.com.sofka

object Main {
  def main(args: Array[String]): Unit = {
    val IVA = 0.19
    val TAX = 0.16

    InvoiceFunctions.createInvoice("Tv", 450, 100, IVA, TAX)
  }

}
