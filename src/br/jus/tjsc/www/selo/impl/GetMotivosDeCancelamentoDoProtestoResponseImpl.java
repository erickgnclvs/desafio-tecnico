/*
 * XML Type:  getMotivosDeCancelamentoDoProtestoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getMotivosDeCancelamentoDoProtestoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetMotivosDeCancelamentoDoProtestoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetMotivosDeCancelamentoDoProtestoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOTIVOSDECANCELAMENTODOPROTESTO$0 = 
        new javax.xml.namespace.QName("", "motivosDeCancelamentoDoProtesto");
    
    
    /**
     * Gets array of all "motivosDeCancelamentoDoProtesto" elements
     */
    public br.jus.tjsc.www.selo.MotivoCancelProtesto[] getMotivosDeCancelamentoDoProtestoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOTIVOSDECANCELAMENTODOPROTESTO$0, targetList);
            br.jus.tjsc.www.selo.MotivoCancelProtesto[] result = new br.jus.tjsc.www.selo.MotivoCancelProtesto[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "motivosDeCancelamentoDoProtesto" element
     */
    public br.jus.tjsc.www.selo.MotivoCancelProtesto getMotivosDeCancelamentoDoProtestoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.MotivoCancelProtesto target = null;
            target = (br.jus.tjsc.www.selo.MotivoCancelProtesto)get_store().find_element_user(MOTIVOSDECANCELAMENTODOPROTESTO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "motivosDeCancelamentoDoProtesto" element
     */
    public int sizeOfMotivosDeCancelamentoDoProtestoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOTIVOSDECANCELAMENTODOPROTESTO$0);
        }
    }
    
    /**
     * Sets array of all "motivosDeCancelamentoDoProtesto" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMotivosDeCancelamentoDoProtestoArray(br.jus.tjsc.www.selo.MotivoCancelProtesto[] motivosDeCancelamentoDoProtestoArray)
    {
        check_orphaned();
        arraySetterHelper(motivosDeCancelamentoDoProtestoArray, MOTIVOSDECANCELAMENTODOPROTESTO$0);
    }
    
    /**
     * Sets ith "motivosDeCancelamentoDoProtesto" element
     */
    public void setMotivosDeCancelamentoDoProtestoArray(int i, br.jus.tjsc.www.selo.MotivoCancelProtesto motivosDeCancelamentoDoProtesto)
    {
        generatedSetterHelperImpl(motivosDeCancelamentoDoProtesto, MOTIVOSDECANCELAMENTODOPROTESTO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "motivosDeCancelamentoDoProtesto" element
     */
    public br.jus.tjsc.www.selo.MotivoCancelProtesto insertNewMotivosDeCancelamentoDoProtesto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.MotivoCancelProtesto target = null;
            target = (br.jus.tjsc.www.selo.MotivoCancelProtesto)get_store().insert_element_user(MOTIVOSDECANCELAMENTODOPROTESTO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "motivosDeCancelamentoDoProtesto" element
     */
    public br.jus.tjsc.www.selo.MotivoCancelProtesto addNewMotivosDeCancelamentoDoProtesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.MotivoCancelProtesto target = null;
            target = (br.jus.tjsc.www.selo.MotivoCancelProtesto)get_store().add_element_user(MOTIVOSDECANCELAMENTODOPROTESTO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "motivosDeCancelamentoDoProtesto" element
     */
    public void removeMotivosDeCancelamentoDoProtesto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOTIVOSDECANCELAMENTODOPROTESTO$0, i);
        }
    }
}
