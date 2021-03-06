import Calculator from "./Calculator";

describe("Inline Calculator Test", () => {
    describe("#add", () => {
        it("should return addition of two operands", () => {
            // Arrange
            const operand1 = 23;
            const operand2 = 56;

            // Act
            const addition = Calculator.add(operand1, operand2);

            // Assert
            expect(addition).toBe(79);
        });
    });
});