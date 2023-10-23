/*
 * XML Type:  getTiposDeProcuracaoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeProcuracaoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeProcuracaoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeProcuracaoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDEPROCURACAO$0 = 
        new javax.xml.namespace.QName("", "tiposDeProcuracao");
    
    
    /**
     * Gets array of all "tiposDeProcuracao" elements
     */
    public br.jus.tjsc.www.selo.TipoProcuracao[] getTiposDeProcuracaoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDEPROCURACAO$0, targetList);
            br.jus.tjsc.www.selo.TipoProcuracao[] result = new br.jus.tjsc.www.selo.TipoProcuracao[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeProcuracao" element
     */
    public br.jus.tjsc.www.selo.TipoProcuracao getTiposDeProcuracaoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoProcuracao target = null;
            target = (br.jus.tjsc.www.selo.TipoProcuracao)get_store().find_element_user(TIPOSDEPROCURACAO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeProcuracao" element
     */
    public int sizeOfTiposDeProcuracaoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDEPROCURACAO$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeProcuracao" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeProcuracaoArray(br.jus.tjsc.www.selo.TipoProcuracao[] tiposDeProcuracaoArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeProcuracaoArray, TIPOSDEPROCURACAO$0);
    }
    
    /**
     * Sets ith "tiposDeProcuracao" element
     */
    public void setTiposDeProcuracaoArray(int i, br.jus.tjsc.www.selo.TipoProcuracao tiposDeProcuracao)
    {
        generatedSetterHelperImpl(tiposDeProcuracao, TIPOSDEPROCURACAO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeProcuracao" element
     */
    public br.jus.tjsc.www.selo.TipoProcuracao insertNewTiposDeProcuracao(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoProcuracao target = null;
            target = (br.jus.tjsc.www.selo.TipoProcuracao)get_store().insert_element_user(TIPOSDEPROCURACAO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeProcuracao" element
     */
    public br.jus.tjsc.www.selo.TipoProcuracao addNewTiposDeProcuracao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoProcuracao target = null;
            target = (br.jus.tjsc.www.selo.TipoProcuracao)get_store().add_element_user(TIPOSDEPROCURACAO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeProcuracao" element
     */
    public void removeTiposDeProcuracao(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDEPROCURACAO$0, i);
        }
    }
}
