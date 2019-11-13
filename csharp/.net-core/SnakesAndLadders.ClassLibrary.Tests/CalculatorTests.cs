using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SnakesAndLadders.ClassLibrary.Tests
{
    [TestClass]
    public class CalculatorTests
    {
        [TestMethod]
        public void AddTwoNumbers()
        {
            Assert.AreEqual(9, Calculator.Add(4, 5));
        }
    }
}
