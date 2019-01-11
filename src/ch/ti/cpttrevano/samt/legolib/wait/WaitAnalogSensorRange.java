/*
 * The MIT License
 *
 * Copyright 2018 SAMT.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ch.ti.cpttrevano.samt.legolib.wait;

/**
 * WaitAnalogSensorRange, used to wait an analog sensor range.
 * In the Lego Mindstorm Environment is rappresented by the orange block "Wait".
 *
 * @author gabrialessi
 * @version 1.0
 */
public class WaitAnalogSensorRange extends WaitSensor {

    protected boolean inRange;

    protected byte minValue;

    protected byte maxValue;

    public WaitAnalogSensorRange(boolean inRange, byte minValue, byte maxValue) {
        setInRange(inRange);
        setMinValue(minValue);
        setMaxValue(maxValue);
    }

    public boolean isInRange() {
        return this.inRange;
    }

    public void setInRange(boolean inRange) {
        this.inRange = inRange;
    }

    public byte getMinValue() {
        return this.minValue;
    }

    public void setMinValue(byte minValue) {
        this.minValue = minValue;
    }

    public byte getMaxValue() {
        return this.maxValue;
    }

    public void setMaxValue(byte maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public void waiter() {
        super.waiter();
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }

    @Override
    public void beginWait() {
        super.beginWait();
    }
}
