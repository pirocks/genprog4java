package ylyu1.wean;

import org.junit.runner.*;
import org.junit.runners.*;
@RunWith(Suite.class)
@Suite.SuiteClasses({
//org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.class
//org.apache.commons.lang3.AnnotationUtilsTest.class
/*,org.apache.commons.lang3.ArrayUtilsAddTest.class
,org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.class
,org.apache.commons.lang3.ArrayUtilsRemoveTest.class
,org.apache.commons.lang3.ArrayUtilsTest.class
,org.apache.commons.lang3.BitFieldTest.class
,org.apache.commons.lang3.BooleanUtilsTest.class
,org.apache.commons.lang3.CharEncodingTest.class
,org.apache.commons.lang3.CharRangeTest.class
,org.apache.commons.lang3.CharSequenceUtilsTest.class
/*,org.apache.commons.lang3.CharSetTest.class
,org.apache.commons.lang3.CharSetUtilsTest.class
,org.apache.commons.lang3.CharUtilsTest.class
,*///org.apache.commons.lang.ClassUtilsTest.class
/*,org.apache.commons.lang3.ConversionTest.class
,org.apache.commons.lang3.EnumUtilsTest.class
,org.apache.commons.lang3.HashSetvBitSetTest.class
,org.apache.commons.lang3.JavaVersionTest.class
,org.apache.commons.lang3.LocaleUtilsTest.class
,org.apache.commons.lang3.ObjectUtilsTest.class
,org.apache.commons.lang3.RandomStringUtilsTest.class
,org.apache.commons.lang3.RangeTest.class
,org.apache.commons.lang3.SerializationUtilsTest.class
,org.apache.commons.lang3.StringEscapeUtilsTest.class
,org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.class
,org.apache.commons.lang3.StringUtilsIsTest.class
,org.apache.commons.lang3.StringUtilsStartsEndsWithTest.class
,org.apache.commons.lang3.StringUtilsSubstringTest.class
,org.apache.commons.lang3.StringUtilsTest.class
,org.apache.commons.lang3.StringUtilsTrimEmptyTest.class
,org.apache.commons.lang3.SystemUtilsTest.class
,org.apache.commons.lang3.ValidateTest.class
,org.apache.commons.lang3.builder.CompareToBuilderTest.class
,org.apache.commons.lang3.builder.DefaultToStringStyleTest.class
,org.apache.commons.lang3.builder.EqualsBuilderTest.class
,org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.class
,org.apache.commons.lang3.builder.HashCodeBuilderTest.class
,org.apache.commons.lang3.builder.MultiLineToStringStyleTest.class
,org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.class
,org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.class
,org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.class
,org.apache.commons.lang3.builder.SimpleToStringStyleTest.class
,org.apache.commons.lang3.builder.StandardToStringStyleTest.class
,org.apache.commons.lang3.builder.ToStringBuilderTest.class
//,org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest.class
,org.apache.commons.lang3.builder.ToStringStyleTest.class
,org.apache.commons.lang3.concurrent.AtomicInitializerTest.class
,org.apache.commons.lang3.concurrent.AtomicSafeInitializerTest.class
,org.apache.commons.lang3.concurrent.BackgroundInitializerTest.class
,org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.class
,org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.class
,org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.class
,org.apache.commons.lang3.concurrent.ConstantInitializerTest.class
,org.apache.commons.lang3.concurrent.LazyInitializerTest.class
,org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.class
,org.apache.commons.lang3.concurrent.TimedSemaphoreTest.class
,org.apache.commons.lang3.event.EventListenerSupportTest.class
,org.apache.commons.lang3.event.EventUtilsTest.class
,org.apache.commons.lang3.exception.ContextedExceptionTest.class
,org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.class
,org.apache.commons.lang3.exception.DefaultExceptionContextTest.class
,org.apache.commons.lang3.exception.ExceptionUtilsTest.class
,org.apache.commons.lang3.math.FractionTest.class
,org.apache.commons.lang3.math.IEEE754rUtilsTest.class
,org.apache.commons.lang3.math.NumberUtilsTest.class
,org.apache.commons.lang3.mutable.MutableBooleanTest.class
,org.apache.commons.lang3.mutable.MutableByteTest.class
,org.apache.commons.lang3.mutable.MutableDoubleTest.class
,org.apache.commons.lang3.mutable.MutableFloatTest.class
,org.apache.commons.lang3.mutable.MutableIntTest.class
,org.apache.commons.lang3.mutable.MutableLongTest.class
,org.apache.commons.lang3.mutable.MutableObjectTest.class
,org.apache.commons.lang3.mutable.MutableShortTest.class
,org.apache.commons.lang3.reflect.ConstructorUtilsTest.class
,org.apache.commons.lang3.reflect.FieldUtilsTest.class
,org.apache.commons.lang3.reflect.MethodUtilsTest.class
,org.apache.commons.lang3.reflect.TypeUtilsTest.class
,org.apache.commons.lang3.text.CompositeFormatTest.class
,org.apache.commons.lang3.text.ExtendedMessageFormatTest.class
,org.apache.commons.lang3.text.FormattableUtilsTest.class
,org.apache.commons.lang3.text.StrBuilderAppendInsertTest.class
,org.apache.commons.lang3.text.StrBuilderTest.class
,org.apache.commons.lang3.text.StrLookupTest.class
,org.apache.commons.lang3.text.StrMatcherTest.class
,org.apache.commons.lang3.text.StrSubstitutorTest.class
,org.apache.commons.lang3.text.StrTokenizerTest.class
,org.apache.commons.lang3.text.WordUtilsTest.class
,org.apache.commons.lang3.text.translate.EntityArraysTest.class
,org.apache.commons.lang3.text.translate.LookupTranslatorTest.class
,org.apache.commons.lang3.text.translate.NumericEntityEscaperTest.class
,org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest.class
,org.apache.commons.lang3.text.translate.OctalUnescaperTest.class
,org.apache.commons.lang3.text.translate.UnicodeEscaperTest.class
,org.apache.commons.lang3.text.translate.UnicodeUnescaperTest.class
,org.apache.commons.lang3.time.DateFormatUtilsTest.class
,org.apache.commons.lang3.time.DateUtilsFragmentTest.class
,org.apache.commons.lang3.time.DateUtilsRoundingTest.class
,org.apache.commons.lang3.time.DateUtilsTest.class
,org.apache.commons.lang3.time.DurationFormatUtilsTest.class
,org.apache.commons.lang3.time.FastDateFormatTest.class
,org.apache.commons.lang3.time.FastDateFormat_ParserTest.class
,org.apache.commons.lang3.time.FastDateFormat_PrinterTest.class
,org.apache.commons.lang3.time.FastDateParserTest.class
,org.apache.commons.lang3.time.FastDatePrinterTest.class
,org.apache.commons.lang3.time.StopWatchTest.class
,org.apache.commons.lang3.tuple.ImmutablePairTest.class
,org.apache.commons.lang3.tuple.ImmutableTripleTest.class
,org.apache.commons.lang3.tuple.MutablePairTest.class
,org.apache.commons.lang3.tuple.MutableTripleTest.class
,org.apache.commons.lang3.tuple.PairTest.class
,org.apache.commons.lang3.tuple.TripleTest.class
*/
})
public class Mainy{}
